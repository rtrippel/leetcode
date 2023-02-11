public class JumpGame2v1 {

    public int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int max = 0;
        int curr = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++){
            max = Math.max(max , i + nums[i]);
            if(curr == i){
                curr = max;
                count++;
            }
            if(curr>nums.length-1){
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        JumpGame2v1 jumpGame2 = new JumpGame2v1();
        int[] nums1 =  {2,3,1,1,4};
        int[] nums2 =  {2,3,0,1,4};
        int[] nums3 =  {2,3,1};
        int[] nums4 =  {1};
        int jumps1 = jumpGame2.jump(nums1);
        int jumps2 = jumpGame2.jump(nums2);
        int jumps3 = jumpGame2.jump(nums3);
        int jumps4 = jumpGame2.jump(nums4);
        System.out.println(jumps1 == 2);
        System.out.println(jumps2 == 2);
        System.out.println(jumps3 == 1);
        System.out.println(jumps4 == 0);
        System.out.println(jumps4);
    }
}

