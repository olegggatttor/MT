import java.io.IOException
import java.io.InputStream
import java.text.ParseException

/**
 * Class for tokenization input for [RegExpParser].
 *
 * See [Token].
 *
 * @author olegggatttor
 */
class RegExpLexicalAnalyzer(private val input: InputStream) {
    var pos = 0
        private set
    var curLexed = ""
        private set
    var prevChar = ""
        private set
    lateinit var curToken: Token

    init {
        nextChar()
    }

    /**
     * Reads next char from [input].
     */
    private fun nextChar() {
        pos++
        try {
            prevChar = curLexed
            curLexed = input.read()
        } catch (ex: IOException) {
            throw ParseException(ex.message, pos)
        }
    }

    /**
     * Checks if [curChar] is blank symbol.
     */
    private fun curIsBlank(): Boolean {
        val symbol = curChar.toChar()
        return symbol == ' ' || symbol == '\r' || symbol == '\n' || symbol == '\t'
    }

    /**
     * Tokenize current character and puts new token to [curToken]. Reads next character.
     *
     * @throws ParseException if meets unexpected character.
     */
    fun nextToken() {
        while (curIsBlank()) {
            nextChar()
        }
        if (curChar == -1) {
            curToken = Token.END
            return
        }
        curToken = when (curChar.toChar()) {
            '(' -> Token.LPAREN
            ')' -> Token.RPAREN
            '|' -> Token.OR
            '*' -> Token.STAR
            '{' -> Token.LBRACE
            '}' -> Token.RBRACE
            in '0'..'9' -> Token.NUMBER
            in 'a'..'z' -> Token.LETTER
            else -> throw ParseException("Unknown character ${curChar.toChar()}", pos)
        }
        nextChar()
    }
}