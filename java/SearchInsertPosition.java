import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchInsertPosition {
        public int searchInsert(int[] nums, int target) {
            if (nums == null) return 0;

            int startPosition = 0;
            int endPosition = nums.length -1;
            int amountElements;
            int middleNumber;
            int middlePosition;

            while (startPosition <= endPosition) {
                amountElements = endPosition - startPosition;
                middlePosition = startPosition + amountElements / 2;
                middleNumber = nums[middlePosition];

                if (middleNumber == target) return middlePosition;
                if (middleNumber > target) {
                    endPosition = middlePosition - 1;
                } else {
                    startPosition = middlePosition + 1;
                }
            }

            return startPosition;
        }


    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,15};
        int[] nums2 = {};
        int[] nums3 = null;
        int[] nums4 = {1};
        int[] nums5 = {1,5,7};
        int[] nums6 = {3,5,7};
        List<int[]> numsList = new ArrayList<>(Arrays.asList(nums1, nums2, nums3, nums4, nums5, nums6));
        int target1 = 15;
        int target2 = 3;
        int target3 = 6;
        int target4 = 66;
        int target5 = 3;
        int target6 = 1;
        List<Integer> targetList = new ArrayList<>(Arrays.asList(target1, target2, target3, target4, target5, target6));
        int result1 = 5;
        int result2 = 0;
        int result3 = 0;
        int result4 = 1;
        int result5 = 1;
        int result6 = 0;
        List<Integer> resultList = new ArrayList<>(Arrays.asList(result1, result2, result3, result4, result5, result6));

        int actual;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        for (int i = 0; i < resultList.size(); i++) {
            actual = searchInsertPosition.searchInsert(numsList.get(i), targetList.get(i));
            System.out.printf("Case number %s is %s. position - %s, target - %s, nums - %s \n", i+1, actual == resultList.get(i), actual, targetList.get(i), Arrays.toString(numsList.get(i)));
        }

    }
}


