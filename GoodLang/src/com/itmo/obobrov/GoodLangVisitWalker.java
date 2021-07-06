package com.itmo.obobrov;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class GoodLangVisitWalker extends GoodLangBaseVisitor<String> {
    final HashSet<String> variables = new HashSet<>();
    final ArrayList<String> functionsDecl = new ArrayList<>();

    @Override
    public String visitProgram(GoodLangParser.ProgramContext ctx) {
        final StringBuilder parts = new StringBuilder();
        for (ParseTree part : ctx.children) {
            final String visited = visit(part);
            parts.append(Objects.requireNonNullElse(visited, ""));
        }
        parts.insert(0, String.join("", functionsDecl));
        parts.insert(0, "#include <stdio.h>\n\n");
        return String.join("\n\n", parts);
    }

    @Override
    public String visitFunction(GoodLangParser.FunctionContext ctx) {
        final HashSet<String> arguments = new HashSet<>();
        final StringBuilder function = new StringBuilder();
        boolean hasArgs = false;
        function
                .append("int ")
                .append(ctx.NAME());
        functionsDecl.add(function.toString() + "();\n\n");
        final Queue<ParseTree> q = new LinkedList<>(ctx.children.subList(2, ctx.children.size()));
        while (!q.isEmpty()) {
            final ParseTree elem = q.poll();
            switch (elem.getText()) {
                case "(", ")" -> function.append(elem.getText());
                case "," -> function.append(", ");
                case "{" -> {
                    if (!hasArgs) {
                        function.append("()");
                    }
                    function.append(" {\n\n");
                    final String body = visit(q.poll());
                    variables.removeAll(arguments);
                    function
                            .append(String.join("", variables))
                            .append(body)
                            .append("return 0;\n")
                            .append(Objects.requireNonNull(q.poll()).getText())
                            .append("\n\n");
                }
                default -> {
                    hasArgs = true;
                    final String arg = visit(elem);
                    arguments.add("int " + arg + ";\n");
                    function
                            .append("int ")
                            .append(arg);
                }
            }
        }
        variables.clear();
        return function.toString();
    }

    @Override
    public String visitArgument(GoodLangParser.ArgumentContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBody(GoodLangParser.BodyContext ctx) {
        final StringBuilder body = new StringBuilder();
        if (ctx.children == null) return "";
        for (ParseTree context : ctx.children) {
            if (!(context instanceof TerminalNode)) {
                body.append(visit(context));
            }
            if (context instanceof GoodLangParser.CallContext) {
                body.append(";\n");
            }
        }
        return body.toString();
    }

    @Override
    public String visitLoop(GoodLangParser.LoopContext ctx) {
        return "while(" +
                visit(ctx.getChild(1)) +
                ") {\n" +
                visit(ctx.getChild(3)) +
                "\n}\n";
    }

    @Override
    public String visitRet(GoodLangParser.RetContext ctx) {
        return "return " + visit(ctx.getChild(1)) + ";\n";
    }

    @Override
    public String visitWhen(GoodLangParser.WhenContext ctx) {
        return visit(ctx.children.get(2));
    }

    @Override
    public String visitWhenBody(GoodLangParser.WhenBodyContext ctx) {
        final ArrayList<String> conditions = new ArrayList<>();
        for (final ParseTree child : ctx.children) {
            conditions.add(Objects.requireNonNullElse(visit(child), ""));
        }
        return conditions.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining("else ")) + "\n";
    }

    @Override
    public String visitWhenCond(GoodLangParser.WhenCondContext ctx) {
        if (!(ctx.getChild(0) instanceof GoodLangParser.OrConditionContext)) {
            return "";
        }
        final StringBuilder condition = new StringBuilder();
        condition.append("if(");
        for (final ParseTree child : ctx.children) {
            if (child instanceof GoodLangParser.OrConditionContext) {
                condition.append(visit(child)).append(") {\n");
            } else if (child instanceof GoodLangParser.BodyContext) {
                condition.append(visit(child));
            }
        }
        condition.append("}");
        return condition.toString();
    }

    @Override
    public String visitElseBranch(GoodLangParser.ElseBranchContext ctx) {
        final StringBuilder condition = new StringBuilder();
        condition.append("if(");
        for (final ParseTree child : ctx.children) {
            if (child instanceof GoodLangParser.BodyContext) {
                condition.append(visit(child));
            } else if (child.getText().equals("otherwise")){
                condition.append("1").append(") {\n");
            }
        }
        condition.append("}");
        return condition.toString();
    }

    @Override
    public String visitAssigment(GoodLangParser.AssigmentContext ctx) {
        final int equalitySign = ctx.children.size() / 2 + 1;
        final HashMap<String, String> realToTemp = new HashMap<>();
        final StringBuilder assigment = new StringBuilder();
        for (int i = 0; i < equalitySign; i += 2) {
            final String realVar = ctx.getChild(i).getText();
            String tempName = "temp" + realVar;
            while (variables.contains(tempName)
                    || realToTemp.containsKey(tempName)
                    || realToTemp.containsValue(tempName)) {
                tempName = "temp" + tempName;
            }
            variables.add("int " + realVar + ";\n");
            realToTemp.put(realVar, tempName);
        }
        final Set<String> varsInRightPart = new HashSet<>();
        for (int i = equalitySign; i < ctx.children.size(); i += 2) {
            final String maybeVar = ctx.getChild(i).getText().replaceAll("[()]", "");
            boolean found = Pattern.matches("[a-zA-Z][a-zA-Z0-9]*", maybeVar);
            if (found) {
                varsInRightPart.add(maybeVar);
            }
        }
        realToTemp.keySet().retainAll(varsInRightPart);
        realToTemp.forEach((real, tmp) -> {
            variables.add("int " + tmp + ";\n");
            assigment.append(tmp).append(" = ").append(real).append(";\n");
        });
        for (int i = 0; i < equalitySign; i += 2) {
            final int j = equalitySign + i;
            final String left = ctx.getChild(i).getText();
            final String right = ctx.getChild(j).getText().replaceAll("[()]", "");
            assigment
                    .append(left)
                    .append(" = ")
                    .append(realToTemp.getOrDefault(right, right))
                    .append(";\n");
        }
        return assigment.toString();
    }

    @Override
    public String visitCall(GoodLangParser.CallContext ctx) {
        final ArrayList<ParseTree> children = new ArrayList<>(ctx.children);
        final StringBuilder functionCall = new StringBuilder();
        functionCall.append(children.get(0)).append("(");
        for (int i = 2; i < children.size(); i++) {
            if (children.get(i).getText().equals(",")) {
                functionCall.append(", ");
            } else if (children.get(i).getText().equals(")")) {
                functionCall.append(")");
            } else {
                functionCall.append(visit(children.get(i)));
            }
        }
        return functionCall.toString();
    }

    @Override
    public String visitRead(GoodLangParser.ReadContext ctx) {
        variables.add("int " + ctx.getChild(0).getText() + ";\n");
        return "scanf(\"%d\", &" + ctx.getChild(0) + ");\n";
    }

    @Override
    public String visitWrite(GoodLangParser.WriteContext ctx) {
        return "printf(\"%d\\n\", " + visit(ctx.getChild(0)) + ");\n";
    }

    @Override
    public String visitOrCondition(GoodLangParser.OrConditionContext ctx) {
        return convertJoining(ctx, "or", s -> " || ");
    }

    @Override
    public String visitAndCondition(GoodLangParser.AndConditionContext ctx) {
        return convertJoining(ctx, "and", s -> " && ");
    }

    @Override
    public String visitCondition(GoodLangParser.ConditionContext ctx) {
        return switch (ctx.getChild(0).getText()) {
            case "!" -> "!(" + visit(ctx.getChild(1)) + ")";
            case "True", "False" -> "(" + ctx.getChild(0).getText().toLowerCase() + ")";
            case "(" -> "(" + visit(ctx.getChild(1)) + ")";
            default -> String.join(" ", List.of(visit(ctx.getChild(0)),
                    visit(ctx.getChild(1)),
                    visit(ctx.getChild(2))));
        };
    }

    private String convertJoining(final ParserRuleContext ctx, final String oldSeps,
                                  final Function<String, String> sepMap) {
        final StringBuilder expr = new StringBuilder();
        for (final ParseTree elem : ctx.children) {
            if (oldSeps.contains(elem.getText())) {
                expr.append(sepMap.apply(elem.getText()));
            } else {
                expr.append(visit(elem));
            }
        }
        return expr.toString();
    }

    @Override
    public String visitExpression(GoodLangParser.ExpressionContext ctx) {
        return convertJoining(ctx, "*/", s -> s);
    }

    @Override
    public String visitMultiplier(GoodLangParser.MultiplierContext ctx) {
        return convertJoining(ctx, "+-", s -> s);
    }

    @Override
    public String visitElement(GoodLangParser.ElementContext ctx) {
        if (ctx.getChild(0).getText().equals("-")
                || ctx.getChild(0).getText().equals("+")) {
            return "(" + ctx.getChild(0).getText() + visit(ctx.element()) + ")";
        } else if (ctx.getChild(0) instanceof GoodLangParser.CallContext) {
            return visit(ctx.getChild(0));
        } else if (ctx.getChild(0).getText().equals("(")) {
            return "(" + visit(ctx.getChild(1)) + ")";
        } else {
            return ctx.getChild(0).getText();
        }
    }

    @Override
    public String visitCmp(GoodLangParser.CmpContext ctx) {
        return ctx.getChild(0).getText();
    }
}
