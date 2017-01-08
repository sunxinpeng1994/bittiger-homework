35_search_insert_position.java
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int cur = 0;
        while(cur < nums.length){
            if(nums[cur] == target){
                return cur;
            }
            else if(nums[cur] < target){
                cur++;
            }
            else{
                return cur;
            }
        }
        return cur;
    }
}