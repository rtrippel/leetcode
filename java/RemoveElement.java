import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null) return  0;
        
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }


    public static void main(String[] args) {
        int[] nums = {}; int val = 5; int expected = 0;
        int[] nums1 = null; int val1 = 15; int expected1 = 0;
        int[] nums2 = {1}; int val2 = 13; int expected2 = 1;
        int[] nums3 = {3}; int val3 = 3; int expected3 = 0;
        int[] nums4 = {3,3,3,4}; int val4 = 23; int expected4 = 4;
        int[] nums5 = {3,3,3,4}; int val5 = 3; int expected5 = 1;
        int[] nums6 = {3,3,3,4}; int val6 = 4; int expected6 = 3;
        int[] nums7 = {3,3,3,3}; int val7 = 3; int expected7 = 0;
        int[] nums8 = {3,3,3,3,33,55,6,3,6,33,3,3,5}; int val8 = 3; int expected8 = 6;
        List<int[]> numsList = new ArrayList<>(Arrays.asList(nums, nums1, nums2, nums3, nums4, nums5, nums6, nums7, nums8));
        List<Integer> valList = new ArrayList<>(Arrays.asList(val, val1, val2, val3, val4, val5, val6, val7, val8));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(expected, expected1, expected2, expected3, expected4, expected5, expected6, expected7, expected8));

        for (int i = 0; i < numsList.size(); i++) {
            int actual = new RemoveElement().removeElement(numsList.get(i), valList.get(i));
            System.out.printf("Case %s is %s; expected val - %s, actual val - %s, nums - %s\n", i, expectedList.get(i) ==  actual, expectedList.get(i), actual, Arrays.toString(numsList.get(i)));
        }


        float float1 = 0.7F;
        float float2 = 0.3F + 0.4F;
        final float EPS = 1E-6F;

        System.out.println(Math.abs(float1 - float2) < EPS); // true
    }
}
