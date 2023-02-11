public class JumpGame2 {

    public int jump(int[] nums) {
        int min = nums.length - 1;
//        int lengthJump = 0;
//        int maxLength = getMaxLength(nums, 0);

        min = getMinJump(nums, 0);

        return min;
    }

    private int getMinJump(int[] nums, int currentPosition) {
        int jumpCount = 0;
        int currentPositionNew = getMaxLengthIndex(nums, currentPosition);
        int maxLength = nums[getMaxLengthIndex(nums, currentPosition)];
        while (true) {
            jumpCount++;
            if (currentPosition + maxLength == nums.length) break;
            getMinJump(nums, currentPositionNew);

        }

        return jumpCount;
    }

    private int getMaxLengthIndex(int[] nums, int currentPosition) {
        int max = 0;
        int maxIndex = 0;
        for (int i = 1; i < nums[currentPosition]; i++) {
            if (max < nums[currentPosition + i]) {
                max = nums[currentPosition + i];
                maxIndex = currentPosition + i;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        JumpGame2 jumpGame2 = new JumpGame2();
        int[] nums1 =  {2,3,1,1,4};
//        int[] nums2 =  {2,3,0,1,4};
//        int[] nums3 =  {2,3,1};
//        int[] nums4 =  {1};
//        int[] nums22 =  {1,2,0,1};
//        int[] nums223 =  {1,2,3};
        int jumps1 = jumpGame2.jump(nums1);
//        int jumps2 = jumpGame2.jump(nums2);
//        int jumps3 = jumpGame2.jump(nums3);
//        int jumps4 = jumpGame2.jump(nums4);
        System.out.println(jumps1 == 2);
//        System.out.println(jumps2 == 2);
//        System.out.println(jumps3 == 1);
//        System.out.println(jumps4 == 0);
        System.out.println(jumps1);
//        System.out.println(jumpGame2.jump(nums22));
//        System.out.println(jumpGame2.jump(nums223));
    }
}

