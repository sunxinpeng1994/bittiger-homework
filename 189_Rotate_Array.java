public class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] temp = new int[len];
        k = k % len;
        for(int i = 0; i < k; i++){
            temp[i] = nums[len - k +i];
        }
        for(int i = 0; i < len - k; i++){
            temp[k+i] = nums[i];
        }
        for(int i = 0; i<len; i++){
            nums[i] = temp[i];
        }
    }
}