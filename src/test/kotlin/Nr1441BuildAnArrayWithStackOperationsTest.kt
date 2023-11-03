import org.junit.jupiter.api.Assertions.assertIterableEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class Nr1441BuildAnArrayWithStackOperationsTest {

    companion object {
        @JvmStatic
        fun argumentsProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(1,3), 3, listOf("Push","Push","Pop","Push")),
            Arguments.of(intArrayOf(1,2, 3), 3, listOf("Push","Push","Push")),
            Arguments.of(intArrayOf(1,2), 4, listOf("Push","Push")),
        )
    }
    
    @ParameterizedTest
    @MethodSource("argumentsProvider")
    fun buildArray(target: IntArray, n: Int, expected: List<String>) {
        assertIterableEquals(expected, Nr1441BuildAnArrayWithStackOperations().buildArray(target, n))
    }
}