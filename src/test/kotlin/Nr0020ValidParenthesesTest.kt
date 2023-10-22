import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class Nr0020ValidParenthesesTest {

    companion object {
        @JvmStatic
        fun argumentsProvider(): Stream<Arguments> = Stream.of(
            Arguments.of("()", true),
            Arguments.of("()[]{}", true),
            Arguments.of("(]", false),
        )
    }
    
    @ParameterizedTest
    @MethodSource("argumentsProvider")
    fun isValid(s: String, expected: Boolean) {
        assertEquals(expected, Nr0020ValidParentheses().isValid(s))
    }
}