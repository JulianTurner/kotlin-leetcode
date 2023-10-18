import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class Nr2050ParallelCoursesIIITest {

    companion object {
        @JvmStatic
        fun argumentsProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(3, arrayOf(intArrayOf(1, 3), intArrayOf(2, 3)), intArrayOf(3, 2, 5), 8),
            Arguments.of(
                5,
                arrayOf(intArrayOf(1, 5), intArrayOf(2, 5), intArrayOf(3, 5), intArrayOf(3, 4), intArrayOf(4, 5)),
                intArrayOf(1, 2, 3, 4, 5), 12
            )
        )
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    fun minimumTime(n: Int, relations: Array<IntArray>, time: IntArray, expected: Int) {
        assertEquals(expected, Nr2050ParallelCoursesIII().minimumTime(n, relations, time))
    }
}