import java.util.Arrays;


/**
 * Time complexity: O(N^2);
 * Space Complexity: O(1);
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int first;
        int second;
        for (int i = 0; i < nums.length; i++) {
            first = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                second = nums[j];
                if (target == first + second) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[2];
    }

    public static void main(String[] args) {
        int[] example1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] example2 = {3,2,4};
        int target2 = 6;
        int[] example3 = {3,3};
        int target3 = 6;
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(example1, target1)));
        System.out.println(Arrays.toString(twoSum.twoSum(example2, target2)));
        System.out.println(Arrays.toString(twoSum.twoSum(example3, target3)));
    }
}
