import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class RulesTests {
    private val parser = RegExpParser()

    @Test
    fun testEmpty() {
        assertEquals("", parser.parse("").toString())
        assertNotEquals("", parser.parse("abc").toString())
        assertNotEquals("", parser.parse("(ab|c)*").toString())
        assertNotEquals("", parser.parse("(a***)c").toString())
    }

    @Test
    fun testOr() {
        assertEquals("a|b", parser.parse("a|b").toString())
        assertEquals("a|b|c|d|(a|b|c|d)", parser.parse("a|b|c|d|(a|b|c|d)").toString())
        assertEquals("c|d|(a|(b|c)|d)", parser.parse("c|d|(a|(b|c)|d)").toString())
    }

    @Test
    fun testConcat() {
        assertEquals("abcdefg", parser.parse("abcdefg").toString())
        assertEquals("a(((((b)))))c(def)g", parser.parse("a(((((b)))))c(def)g").toString())
        assertEquals("a**(((((b))*)))*c(de*f)**g", parser.parse("a**(((((b))*)))*c(de*f)**g").toString())
    }

    @Test
    fun testStars() {
        assertEquals("a*b*c*", parser.parse("a*b*c*").toString())
        assertEquals("a*((((b)*)*)**)c*(b*|c**)*", parser.parse("a*((((b)*)*)**)c*(b*|c**)*").toString())
        assertEquals("(a*|(b*|c*|(a|b|c)*))*", parser.parse("(a*|(b*|c*|(a|b|c)*))*").toString())
    }

    @Test
    fun testBraces() {
        assertEquals("a{5}", parser.parse("a{5}").toString())
        assertEquals("a{519}", parser.parse("a{519}").toString())
        assertEquals("a{5}", parser.parse("a{5}").toString())
        assertEquals("b{5}|a{519}|xxx*", parser.parse("b{5}|a{519}|xxx*").toString())
        assertEquals("(b{5}|a{519}|xxx*){10}|(abc|d*){5}",
            parser.parse("(b{5}|a{519}|xxx*){10}|(abc|d*){5}").toString())
        assertEquals("((a{5}){10})***", parser.parse("((a{5}){10})***").toString())
        assertEquals("a{2}|b{3}", parser.parse("a{2}|b{3}").toString())
    }
}