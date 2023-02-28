import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArrayV2 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int inputIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[inputIndex] = nums[i];
            }
        }


        return inputIndex;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrayV2 removeDuplicatesFromSortedArrayV2 = new RemoveDuplicatesFromSortedArrayV2();
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        int[] input1 = {1, 2, 2, 4};
        int[] expected1 = {1, 2, 4};
        int[] input2 = {};
        int[] expected2 = {};
        int[] input3 = {2, 2};
        int[] expected3 = {2};
        int[] input4 = {1, 2, 2, 5, 5, 5, 6};
        int[] expected4 = {1, 2, 5, 6};
        int[] input5 = null;
        int[] expected5 = null;

        List<int[]> inputList = new ArrayList<>(Arrays.asList(input, input1, input2, input3, input4, input5));
        List<int[]> expectedList = new ArrayList<>(Arrays.asList(expected, expected1, expected2, expected3, expected4, null));
        List<Integer> resultList = new ArrayList<>(Arrays.asList(4, 3, 0, 1, 4, 0));

        if (inputList.size() == expectedList.size() && expectedList.size() == resultList.size()) {
            int result;
            for (int i = 0; i < resultList.size(); i++) {
                result = removeDuplicatesFromSortedArrayV2.removeDuplicates(inputList.get(i));
                boolean isSizeEqual = removeDuplicatesFromSortedArrayV2.assertEquals(resultList.get(i), result);
                boolean isArrayEqual = removeDuplicatesFromSortedArrayV2.assertArrayEquals(expectedList.get(i), inputList.get(i));
                System.out.printf("Case %s is %s, input %s\n", i, (isSizeEqual && isArrayEqual), Arrays.toString(inputList.get(i)));
            }
        }
    }


    private boolean assertEquals(int expected, int actual) {
        return expected == actual;
    }

    private boolean assertArrayEquals(int[] expected, int[] actual) {
        if (expected == null || actual == null || expected.length > actual.length) return false;
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != actual[i]) return false;
        }
        return true;
    }
}

