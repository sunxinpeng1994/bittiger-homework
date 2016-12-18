public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] ans = new int[2];
        int len = numbers.length;
        for(int i = 0; i < len; i++){
            if(map.containsKey(numbers[i])){
                ans[0] = map.get(numbers[i]) + 1;
                ans[1] = i+1;
                return ans;
            }
            else{
                map.put(target-numbers[i],i);
            }
        }
        return ans;
    }
}