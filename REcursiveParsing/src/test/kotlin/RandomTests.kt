import org.junit.Test
import java.util.Random
import kotlin.streams.asSequence
import kotlin.test.assertEquals

class RandomTests {
    private val amountOfTests = 100
    private val parser = RegExpParser()

    private fun generate(): String {
        val source = "abcdefghijklmnopqrstuvwxyzEEEEEE"
        val gen = Random()
        var expression = "E"
        repeat(10) {
            val parts = expression.split("E")
            expression = ""
            for (part in parts) {
                var newPart = "a"
                while (Math.random() > 0.4) {
                    val probability = Math.random()
                    newPart += when {
                        probability < 0.25 -> "(E)"
                        probability < 0.50 -> "|c"
                        probability < 0.75 -> "**"
                        else -> gen
                            .ints(5, 0, source.length)
                            .asSequence()
                            .map(source::get)
                            .joinToString("")
                    }
                }
                expression += part + newPart + "E"
            }
        }
        expression = expression.replace("E", "x")
        return expression
    }

    @Test
    fun testOnRandomInput() {
        repeat(amountOfTests) {
            val test = generate()
            assertEquals(test, parser.parse(test).toString())
        }
    }
}