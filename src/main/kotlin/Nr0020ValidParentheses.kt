import java.util.Stack

class Nr0020ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        s.forEach { currentCar ->
            when (currentCar) {
                '(' , '[', '{' -> stack.add(currentCar)
                else -> {
                    if (stack.isEmpty() || stack.pop() != getOpeningBracket(currentCar))
                        return false
                }

            }
        }
        return stack.isEmpty()
    }

    private fun getOpeningBracket(closingBracket: Char): Char = when (closingBracket) {
        ')'  -> '('
        ']' -> '['
        '}' -> '{'
        else -> throw IllegalArgumentException()
    }
}