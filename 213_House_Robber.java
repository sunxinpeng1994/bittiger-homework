213_House_Robber.java
public class Solution {
    public int rob(int[] nums) {
        // there are two cases to consier
        //1.if we consider robbing the first house, we just need to calculate the maximum money we can get before last one.
        //2.if we consider robbing the last house, we can just skip the first house, the primary dp thought is same with HOUSE ROBBDER 1
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int[] maxSum1 = new int[nums.length + 1];
        int[] maxSum2 = new int[nums.length + 1];
        maxSum1[0] = 0;
        maxSum1[1] = nums[0];
        
        maxSum2[0] = 0;
        maxSum2[1] = 0;
        for(int i = 2; i < nums.length; i++){
            maxSum1[i] = Math.max(maxSum1[i-2] + nums[i - 1], maxSum1[i - 1]);
        }
        for(int i = 2; i <= nums.length; i++){
            maxSum2[i] = Math.max(maxSum2[i - 2] + nums[i - 1], maxSum2[i - 1]);
        }
        return maxSum1[nums.length - 1] > maxSum2[nums.length]? maxSum1[nums.length - 1]:maxSum2[nums.length];
        
    }
}