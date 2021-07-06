class GraphBuilder {
    private var cnt = 0

    fun makeGraph(t: Tree) {
        val tmp = cnt
        if (t.node == "|" || t.node == "*" || t.node == "(" || t.node == ")") {
            return
        }
        println("${t.node}$tmp [label=\"${t.node}\"]")
        for (ch in t.children) {
            cnt++
            val name = when (ch.node) {
                "|" -> {
                    "or"
                }
                "*" -> {
                    "star"
                }
                "(" -> {
                    "lPar"
                }
                ")" -> {
                    "rPar"
                }
                else -> {
                    ch.node
                }
            }
            println("${name}$cnt [label=\"${name}\"]")
            println("${t.node}$tmp -> ${name}${cnt}")
            makeGraph(ch)
        }
    }
}