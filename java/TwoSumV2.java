import java.util.Arrays;
import java.util.HashMap;

/**
 * Complexity
 * Time complexity: O(N);
 * Space Complexity: O(N);
 */
public class TwoSumV2 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int secondNum;

        for (int i = 0; i < nums.length; i++) {
            secondNum = target - nums[i];
            if (map.containsKey(secondNum)) {
                return new int[] {map.get(secondNum), i};
            }

            map.put(nums[i], i);
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
        TwoSumV2 twoSum = new TwoSumV2();
        System.out.println(Arrays.toString(twoSum.twoSum(example1, target1)));
        System.out.println(Arrays.toString(twoSum.twoSum(example2, target2)));
        System.out.println(Arrays.toString(twoSum.twoSum(example3, target3)));
    }
}
