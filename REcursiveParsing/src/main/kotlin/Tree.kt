/**
 * Class for storing expression parsed by [RegExpParser].
 *
 * @author olegggatttor
 */
class Tree(val node: String) {
    var children = emptyArray<Tree>()

    constructor(node: String, _children: Array<Tree>) : this(node) {
        children = _children
    }

    /**
     * Converts tree to [String] representation.
     */
    override fun toString(): String {
        return when {
            node == "{" ||node == "*" || node == "("
                    || node == ")" || node == "|"
                    || (node.length == 1 && node[0] in 'a'..'z')
                    || node == "}"
                    || (node.isNotEmpty() && node[0] in '0'..'9') -> node
            else -> children.joinToString("")
        }
    }
}
