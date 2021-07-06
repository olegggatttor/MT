fun main() {
    val ps = RegExpParser()
    val a = ps.parse("a(b|c*)")
    val builder = GraphBuilder()
    builder.makeGraph(a)
}