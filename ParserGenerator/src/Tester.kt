import calc.CalcParser
import regexp.RegexpParser

fun main() {
    val regParser = RegexpParser()

    val regRes = regParser.parse("(a*)*bc")

    println(regRes.str)

    val calcParser = CalcParser()

    val calcRes = calcParser.parse("1 + 2 + 3")

    println(calcRes.value)

}