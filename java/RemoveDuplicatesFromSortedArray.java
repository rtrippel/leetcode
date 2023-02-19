public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int currentIndex = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] != nums[i]) {
                nums[currentIndex] = nums[i + 1];
                currentIndex++;
            }
        }

        return currentIndex;
    }
}
