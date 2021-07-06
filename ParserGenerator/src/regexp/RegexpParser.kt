package regexp

import java.text.ParseException

class RegexpParser {
    lateinit var lexer: RegexpLexicalAnalyzer

    fun parse(input: String): Tree {
        lexer = RegexpLexicalAnalyzer(input)
        lexer.nextToken()
        return s()
    }

    fun getParsed() = lexer.prevLexedString


    fun verify(token: RegexpToken) {
        if (token != lexer.curToken) throw ParseException(
            "Expected: ${token}, found: ${lexer.curToken}", lexer.pos
        )
    }

    fun s(): Tree {
        val res = Tree("s")
        when (lexer.curToken) {
            RegexpToken.ALPHA, RegexpToken.OPEN -> {
                val e0 = e()
                res.children.add(e0)
                res.run { str = e0.str }

            }
            RegexpToken.END -> {
                res.children.add(Tree("EPS"))
                res.children.last().run { }


                res.run { str = "" }

            }
            else -> throw ParseException(
                "Invalid string ${lexer.prevLexedString} at position ${lexer.pos - 2}", lexer.pos
            )
        }
        return res
    }

    fun e(): Tree {
        val res = Tree("e")
        when (lexer.curToken) {
            RegexpToken.ALPHA, RegexpToken.OPEN -> {
                val r0 = r()
                res.children.add(r0)
                val es0 = es()
                res.children.add(es0)
                res.run { str = r0.str!! + es0.str!! }

            }
            else -> throw ParseException(
                "Invalid string ${lexer.prevLexedString} at position ${lexer.pos - 2}", lexer.pos
            )
        }
        return res
    }

    fun es(): Tree {
        val res = Tree("es")
        when (lexer.curToken) {
            RegexpToken.OR -> {
                res.children.add(Tree("OR"))
                res.children.last().run { }

                verify(RegexpToken.OR)
                lexer.nextToken()

                val r0 = r()
                res.children.add(r0)
                val es0 = es()
                res.children.add(es0)
                res.run { str = "|" + r0.str!! + es0.str!! }

            }
            RegexpToken.END, RegexpToken.CLOSE -> {
                res.children.add(Tree("EPS"))
                res.children.last().run { }


                res.run { str = "" }

            }
            else -> throw ParseException(
                "Invalid string ${lexer.prevLexedString} at position ${lexer.pos - 2}", lexer.pos
            )
        }
        return res
    }

    fun r(): Tree {
        val res = Tree("r")
        when (lexer.curToken) {
            RegexpToken.ALPHA, RegexpToken.OPEN -> {
                val t0 = t()
                res.children.add(t0)
                val rs0 = rs()
                res.children.add(rs0)
                res.run { str = t0.str!! + rs0.str!! }

            }
            else -> throw ParseException(
                "Invalid string ${lexer.prevLexedString} at position ${lexer.pos - 2}", lexer.pos
            )
        }
        return res
    }

    fun rs(): Tree {
        val res = Tree("rs")
        when (lexer.curToken) {
            RegexpToken.ALPHA, RegexpToken.OPEN -> {
                val t0 = t()
                res.children.add(t0)
                val rs0 = rs()
                res.children.add(rs0)
                res.run { str = t0.str!! + rs0.str!! }

            }
            RegexpToken.OR, RegexpToken.END, RegexpToken.CLOSE -> {
                res.children.add(Tree("EPS"))
                res.children.last().run { }


                res.run { str = "" }

            }
            else -> throw ParseException(
                "Invalid string ${lexer.prevLexedString} at position ${lexer.pos - 2}", lexer.pos
            )
        }
        return res
    }

    fun t(): Tree {
        val res = Tree("t")
        when (lexer.curToken) {
            RegexpToken.ALPHA -> {
                res.children.add(Tree("ALPHA"))
                res.children.last().run { str = getParsed() }

                verify(RegexpToken.ALPHA)
                lexer.nextToken()

                val ts0 = ts()
                res.children.add(ts0)
                res.run { str = getChild(0).str!! + ts0.str!! }

            }
            RegexpToken.OPEN -> {
                res.children.add(Tree("OPEN"))
                res.children.last().run { }

                verify(RegexpToken.OPEN)
                lexer.nextToken()

                val e0 = e()
                res.children.add(e0)
                res.children.add(Tree("CLOSE"))
                res.children.last().run { }

                verify(RegexpToken.CLOSE)
                lexer.nextToken()

                val ts0 = ts()
                res.children.add(ts0)
                res.run { str = "(" + e0.str!! + ")" + ts0.str!! }

            }
            else -> throw ParseException(
                "Invalid string ${lexer.prevLexedString} at position ${lexer.pos - 2}", lexer.pos
            )
        }
        return res
    }

    fun ts(): Tree {
        val res = Tree("ts")
        when (lexer.curToken) {
            RegexpToken.STAR -> {
                res.children.add(Tree("STAR"))
                res.children.last().run { }

                verify(RegexpToken.STAR)
                lexer.nextToken()

                res.run { str = "*" }

            }
            RegexpToken.OR, RegexpToken.ALPHA, RegexpToken.END, RegexpToken.CLOSE, RegexpToken.OPEN -> {
                res.children.add(Tree("EPS"))
                res.children.last().run { }


                res.run { str = "" }

            }
            else -> throw ParseException(
                "Invalid string ${lexer.prevLexedString} at position ${lexer.pos - 2}", lexer.pos
            )
        }
        return res
    }
}