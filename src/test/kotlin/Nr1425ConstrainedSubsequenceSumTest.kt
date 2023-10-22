import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class Nr1425ConstrainedSubsequenceSumTest {

companion object {
    @JvmStatic
    fun argumentsProvider(): Stream<Arguments> = Stream.of(
        Arguments.of(intArrayOf(10,2,-10,5,20), 2,37),
        Arguments.of(intArrayOf(-1,-2,-3), 1, -1),
        Arguments.of(intArrayOf(10,-2,-10,-5,20), 2,23),
    )
}

@ParameterizedTest
@MethodSource("argumentsProvider")
    fun constrainedSubsetSum(nums: IntArray, k: Int, expected: Int) {
        assertEquals(expected, Nr1425ConstrainedSubsequenceSum().constrainedSubsetSum(nums, k))
    }
}