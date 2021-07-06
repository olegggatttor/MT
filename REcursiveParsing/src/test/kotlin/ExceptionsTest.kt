import org.junit.Test
import java.text.ParseException

class ExceptionsTest {
    private val parser = RegExpParser()

    @Test(expected = ParseException::class)
    fun emptyExpression() {
        parser.parse("())")
    }

    @Test(expected = ParseException::class)
    fun missedLetter() {
        parser.parse("a|(|c)")
    }

    @Test(expected = ParseException::class)
    fun wrongStar() {
        parser.parse("(z(abc*(a|*))a)")
    }

    @Test(expected = ParseException::class)
    fun doubleOr() {
        parser.parse("a|b||c")
    }

    @Test(expected = ParseException::class)
    fun missedParentheses() {
        parser.parse("(a|b|c(a)")
    }
}