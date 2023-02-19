import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.stream.Stream;


@SpringBootTest(classes = RemoveDuplicatesFromSortedArray.class)
class RemoveDuplicatesFromSortedArrayTest {

    @Autowired
    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;




    public static Stream<Arguments> getInputAndOutput() {
        int[] input1 = {1,1,2};
        int[] output1 = {1,2};
        int[] input2 = {0,0,1,1,1,2,2,3,3,4};
        int[] output2 = {0,1,2,3,4};


        return Stream.of(
                Arguments.of(input1, output1),
                Arguments.of(input2, output2)

        );
    }

    @ParameterizedTest
    @MethodSource("getInputAndOutput")
    public void testSuccess(int[] input, int[] output){

        int result = removeDuplicatesFromSortedArray.removeDuplicates(input);
        Assertions.assertEquals(output.length, result);
        Assertions.assertArrayEquals(output, Arrays.copyOf(input, output.length));
    }


}