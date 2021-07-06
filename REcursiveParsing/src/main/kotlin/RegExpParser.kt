import java.io.ByteArrayInputStream
import java.text.ParseException

/**
 * Parser class for language of Regular Expressions with concatenations, or, Kleene star,
 * parentheses and lowercase letters from 'a' to 'z'.
 *
 * See [RegExpLexicalAnalyzer].
 * See [Tree].
 * See [Token].
 *
 * @author olegggatttor
 */
class RegExpParser {
    lateinit var lexer: RegExpLexicalAnalyzer

    private fun start(): Tree {
        return when (lexer.curToken) {
            Token.LETTER, Token.LPAREN -> {
                Tree("start", arrayOf(expression()))
            }
            Token.END -> {
                Tree("start")
            }
            else -> throw ParseException(
                "Invalid character ${lexer.prevChar.toChar()} at position ${lexer.pos - 1}", lexer.pos
            )
        }
    }

    private fun expression(): Tree {
        return when (lexer.curToken) {
            Token.LETTER, Token.LPAREN -> {
                Tree("expression", arrayOf(orHead(), orRest()))
            }
            else -> throw ParseException(
                "Invalid character ${lexer.prevChar.toChar()} at position ${lexer.pos - 1}", lexer.pos
            )
        }
    }

    private fun orHead(): Tree {
        return when (lexer.curToken) {
            Token.LETTER, Token.LPAREN -> {
                Tree("orHead", arrayOf(concatHead(), concatRest()))
            }
            else -> throw ParseException(
                "Invalid character ${lexer.prevChar.toChar()} at position ${lexer.pos - 1}", lexer.pos
            )
        }
    }

    private fun orRest(): Tree {
        return when (lexer.curToken) {
            Token.OR -> {
                lexer.nextToken()
                Tree("orRest", arrayOf(Tree("|"), orHead(), orRest()))
            }
            Token.RPAREN, Token.END -> {
                Tree("orRest")
            }
            else -> throw ParseException(
                "Invalid character ${lexer.prevChar.toChar()} at position ${lexer.pos - 1}", lexer.pos
            )
        }
    }

    private fun concatHead(): Tree {
        return when (lexer.curToken) {
            Token.LETTER -> {
                val prev = lexer.prevChar.toChar()
                lexer.nextToken()
                Tree("concatHead", arrayOf(Tree("$prev"), starsOrNum()))
            }
            Token.LPAREN -> {
                lexer.nextToken()
                val expr = expression()
                if (lexer.curToken != Token.RPAREN) {
                    throw ParseException(
                        "Invalid character at position ${lexer.pos}. Expected: \")\".",
                        lexer.pos
                    )
                }
                lexer.nextToken()
                Tree("concatHead", arrayOf(Tree("("), expr, Tree(")"), starsOrNum()))
            }
            else -> throw ParseException(
                "Invalid character ${lexer.prevChar.toChar()} at position ${lexer.pos - 1}", lexer.pos
            )
        }
    }

    private fun concatRest(): Tree {
        return when (lexer.curToken) {
            Token.LETTER, Token.LPAREN -> {
                Tree("concatRest", arrayOf(concatHead(), concatRest()))
            }
            Token.RPAREN, Token.END, Token.OR -> {
                Tree("concatRest")
            }
            else -> throw ParseException(
                "Invalid character ${lexer.prevChar.toChar()} at position ${lexer.pos - 1}", lexer.pos
            )
        }
    }

    private fun starsOrNum(): Tree {
        return when (lexer.curToken) {
            Token.STAR -> {
                lexer.nextToken()
                Tree("stars", arrayOf(Tree("*"), stars()))
            }
            Token.LBRACE -> {
                lexer.nextToken()
                val num = StringBuilder()
                while (lexer.curToken == Token.NUMBER) {
                    num.append(lexer.prevChar.toChar())
                    lexer.nextToken()
                }
                if (lexer.curToken != Token.RBRACE) {
                    throw ParseException(
                        "Invalid character at position ${lexer.pos}. Expected: \")\".",
                        lexer.pos
                    )
                }
                lexer.nextToken()
                Tree("amount", arrayOf(Tree("{"), Tree(num.toString()), Tree("}")))
            }
            Token.LETTER, Token.LPAREN, Token.OR,
            Token.RPAREN, Token.END -> {
                Tree("stars")
            }
            else -> throw ParseException(
                "Invalid character ${lexer.prevChar.toChar()} at position ${lexer.pos - 1}", lexer.pos
            )
        }
    }

    private fun stars(): Tree {
        return when (lexer.curToken) {
            Token.STAR -> {
                lexer.nextToken()
                Tree("stars", arrayOf(Tree("*"), stars()))
            }
            Token.LETTER, Token.LPAREN, Token.OR,
            Token.RPAREN, Token.END -> {
                Tree("stars")
            }
            else -> throw ParseException(
                "Invalid character ${lexer.prevChar.toChar()} at position ${lexer.pos - 1}", lexer.pos
            )
        }
    }

    fun parse(input: String): Tree {
        lexer = RegExpLexicalAnalyzer(ByteArrayInputStream(input.toByteArray()))
        lexer.nextToken()
        return start()
    }
}