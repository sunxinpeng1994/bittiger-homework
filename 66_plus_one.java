c class Solution {
    public int[] plusOne(int[] digits) {
        //corner case
        if(digits == null){
            digits[0] = 1;
            return digits;
        }

        int len = digits.length;
        boolean flag = false;
        //  plus 题目的核心是 int carry = 0 也就是进位处理
        // 这里最好使用carry
        //core logic
        digits[len - 1] += 1;
        for(int i = len-1; i>=0; i--){
            digits[i] = digits[i] + (flag ? 1 : 0);
            if(digits[i] == 10){
                digits[i] -= 10;
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        if(digits[0] == 0){
            int[] ans = new int[len+1];
            ans[0] = 1;
            for(int i = 1; i<len+1; i++){
                ans[i] = 0;
            }
            return ans;
        }
        return digits;


    }
}
