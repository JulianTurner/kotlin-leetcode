class Nr1441BuildAnArrayWithStackOperations {
    private fun MutableList<String>.simplePush() = add("Push")
    private fun MutableList<String>.popAndPush() {
        add("Pop")
        simplePush()
    }

    fun buildArray(target: IntArray, n: Int): List<String> = buildList {
        val intIterator = (1..n).iterator()
        target.forEach { nextTarget ->
            simplePush()
            var nextValue = intIterator.next()
            while (nextValue != nextTarget) {
                popAndPush()
                nextValue = intIterator.next()
            }
        }
    }
}