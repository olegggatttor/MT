package calc

class Tree(val node: String) {
    val children = arrayListOf<Tree>()
	var value:Int? = null

fun getChild(i : Int) = children[i]


}