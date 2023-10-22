import java.util.PriorityQueue

class Nr1425ConstrainedSubsequenceSum {
    fun constrainedSubsetSum(nums: IntArray, k: Int): Int {
        val pQ = PriorityQueue<Pair<Int, Int>>(compareByDescending { it.second }) // <index, value>

        return (nums.lastIndex downTo 0).maxOf { index ->
            val maxPermittedIndex = index + k
            while (pQ.isNotEmpty() && maxPermittedIndex < pQ.peek().first )
                pQ.remove()
            (nums[index] + (pQ.peek()?.second ?: 0)).also {
                if(it > 0) pQ.add(index to it)
            }
        }

    }
}