import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;


@SpringBootTest(classes = ValidParentheses.class)
class ValidParenthesesTest {

    @Autowired
    ValidParentheses validParentheses;

    public static Stream<Arguments> getInputOutput() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false)
        );
    }

    @ParameterizedTest
    @MethodSource("getInputOutput")
    void testSuccess(String input, boolean expected) {

        boolean result = validParentheses.isValid(input);
        Assertions.assertEquals(result, expected);
    }
}