package calc

import java.text.ParseException

class CalcParser {
    lateinit var lexer: CalcLexicalAnalyzer

    fun parse(input: String): Tree {
        lexer = CalcLexicalAnalyzer(input)
        lexer.nextToken()
        return e()
    }

    fun getParsed() = lexer.prevLexedString


    fun verify(token: CalcToken) {
        if (token != lexer.curToken) throw ParseException(
            "Expected: ${token}, found: ${lexer.curToken}", lexer.pos
        )
    }

    fun e(): Tree {
        val res = Tree("e")
        when (lexer.curToken) {
            CalcToken.NUM, CalcToken.OPEN -> {
                val t0 = t()
                res.children.add(t0)
                val es0 = es((t0.value))
                res.children.add(es0)
                res.run { value = es0.value }

            }
            else -> throw ParseException(
                "Invalid string ${lexer.prevLexedString} at position ${lexer.pos - 2}", lexer.pos
            )
        }
        return res
    }

    fun es(acc: Int?): Tree {
        val res = Tree("es")
        when (lexer.curToken) {
            CalcToken.PLUS -> {
                res.children.add(Tree("PLUS"))
                res.children.last().run { }

                verify(CalcToken.PLUS)
                lexer.nextToken()

                val t0 = t()
                res.children.add(t0)
                val es0 = es((acc!! + t0.value!!))
                res.children.add(es0)
                res.run { value = es0.value }

            }
            CalcToken.MINUS -> {
                res.children.add(Tree("MINUS"))
                res.children.last().run { }

                verify(CalcToken.MINUS)
                lexer.nextToken()

                val t0 = t()
                res.children.add(t0)
                val es0 = es((acc!! - t0.value!!))
                res.children.add(es0)
                res.run { value = es0.value }

            }
            CalcToken.END, CalcToken.CLOSE -> {
                res.children.add(Tree("EPS"))
                res.children.last().run { }


                res.run { value = acc }

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
            CalcToken.NUM, CalcToken.OPEN -> {
                val f0 = f()
                res.children.add(f0)
                val ts0 = ts((f0.value))
                res.children.add(ts0)
                res.run { value = ts0.value }

            }
            else -> throw ParseException(
                "Invalid string ${lexer.prevLexedString} at position ${lexer.pos - 2}", lexer.pos
            )
        }
        return res
    }

    fun ts(acc: Int?): Tree {
        val res = Tree("ts")
        when (lexer.curToken) {
            CalcToken.MUL -> {
                res.children.add(Tree("MUL"))
                res.children.last().run { }

                verify(CalcToken.MUL)
                lexer.nextToken()

                val f0 = f()
                res.children.add(f0)
                val ts0 = ts((acc!! * f0.value!!))
                res.children.add(ts0)
                res.run { value = ts0.value }

            }
            CalcToken.DIV -> {
                res.children.add(Tree("DIV"))
                res.children.last().run { }

                verify(CalcToken.DIV)
                lexer.nextToken()

                val f0 = f()
                res.children.add(f0)
                val ts0 = ts((acc!! / f0.value!!))
                res.children.add(ts0)
                res.run { value = ts0.value }

            }
            CalcToken.MOD -> {
                res.children.add(Tree("MOD"))
                res.children.last().run { }

                verify(CalcToken.MOD)
                lexer.nextToken()

                val f0 = f()
                res.children.add(f0)
                val ts0 = ts((acc!! % f0.value!!))
                res.children.add(ts0)
                res.run { value = ts0.value }

            }
            CalcToken.END, CalcToken.CLOSE, CalcToken.PLUS, CalcToken.MINUS -> {
                res.children.add(Tree("EPS"))
                res.children.last().run { }


                res.run { value = acc }

            }
            else -> throw ParseException(
                "Invalid string ${lexer.prevLexedString} at position ${lexer.pos - 2}", lexer.pos
            )
        }
        return res
    }

    fun f(): Tree {
        val res = Tree("f")
        when (lexer.curToken) {
            CalcToken.NUM -> {
                res.children.add(Tree("NUM"))
                res.children.last().run { value = getParsed().toInt() }

                verify(CalcToken.NUM)
                lexer.nextToken()

                res.run { value = getChild(0).value }

            }
            CalcToken.OPEN -> {
                res.children.add(Tree("OPEN"))
                res.children.last().run { }

                verify(CalcToken.OPEN)
                lexer.nextToken()

                val e0 = e()
                res.children.add(e0)
                res.children.add(Tree("CLOSE"))
                res.children.last().run { }

                verify(CalcToken.CLOSE)
                lexer.nextToken()

                res.run { value = e0.value }

            }
            else -> throw ParseException(
                "Invalid string ${lexer.prevLexedString} at position ${lexer.pos - 2}", lexer.pos
            )
        }
        return res
    }
}