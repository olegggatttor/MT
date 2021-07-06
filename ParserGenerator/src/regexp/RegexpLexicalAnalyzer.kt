package regexp

import java.io.IOException
import java.io.InputStream
import java.text.ParseException

class RegexpLexicalAnalyzer(private val input: String) {
    var pos = 0
        private set
    var curLexed = ""
        private set
    var prevLexedString = ""
        private set
    val inputLen = input.length
    var save = ""
    lateinit var curToken: RegexpToken

    val regs: Array<Regex> = arrayOf(Regex("\\|"), Regex("[a-z]"), Regex("\\("), Regex("\\)"), Regex("\\*"))

    val skip = arrayOf(Regex("\$[a-z]"), Regex("[ \n\t\r]"))

    init {
        nextLexem()
    }

    private fun nextLexem() {
        if (pos >= inputLen) return
        if (curLexed == "") curLexed += input[pos++]
        if (curIsBlank()) return
        if (!anyRegexMatch()) throw ParseException("Unknown token", pos)
        while (anyRegexMatch() && pos < inputLen) {
            curLexed += input[pos++]
        }
    }

    fun anyRegexMatch(): Boolean {
        return regs.any { it.matches(curLexed) }
    }


    private fun curIsBlank(): Boolean {
        return skip.any { it.matches(curLexed)}
    }

    fun nextToken() {
while (curIsBlank()) {
            curLexed = ""
            nextLexem()
        }
        if (curLexed == "") {
            curToken = RegexpToken.END
            return
        }
        if (curLexed.length > 1) {
            save = curLexed.last().toString()
            curLexed = curLexed.dropLast(1)
        } else {
            save = ""
        }
        curToken = when {
		regs[0].matches(curLexed) -> RegexpToken.OR
		regs[1].matches(curLexed) -> RegexpToken.ALPHA
		regs[2].matches(curLexed) -> RegexpToken.OPEN
		regs[3].matches(curLexed) -> RegexpToken.CLOSE
		regs[4].matches(curLexed) -> RegexpToken.STAR        
		else -> throw ParseException("Unknown token", pos)
		}
prevLexedString = curLexed
        curLexed = "" + save
        if (curIsBlank()) {
            while (curIsBlank()) {
                curLexed = ""
                nextLexem()
            }
        } else nextLexem()        }
    }
