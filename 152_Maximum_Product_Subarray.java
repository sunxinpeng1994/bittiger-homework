152_Maximum_Product_Subarray.java
public class Solution {
    public int maxProduct(int[] nums) {
        //maxToHere means the maximum product we can get at place "i", so we need to record it. and considering the negative numbers, so we maxToHere may comes from the product from nums[i] and minToHere(which means the minimum product we can get at place "i - 1") after one traversal, we will get the maximum product from contiguous subarray 
        int max = nums[0];
        int maxToHere = nums[0];
        int minToHere = nums[0];
        for(int i = 1; i < nums.length; i++){
            int temp = maxToHere;
            maxToHere = Math.max(Math.max(maxToHere * nums[i], minToHere * nums[i]), nums[i]);
            minToHere = Math.min(Math.min(temp * nums[i], minToHere * nums[i]), nums[i]);
            max = Math.max(max, maxToHere);
        }
        return max;
    }
}