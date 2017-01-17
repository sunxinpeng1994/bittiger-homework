c class Solution {
    public String addStrings(String num1, String num2) {
        //corner case
        if(num1 == null || num1.length() == 0){
            return num2;
        }
        if(num2 == null || num2.length() == 0){
            return num1;
        }
        //core logic
        char[] num1c = num1.toCharArray();
        char[] num2c = num2.toCharArray();
        StringBuilder ans = new StringBuilder();
        int i = num1c.length - 1;
        int j = num2c.length - 1;
        int flag = 0; // int carry = 0;
        // 3个while循环的if else 中有重复代码 
        while(i >= 0 && j >= 0){
            int temp = 0;
            temp = num1c[i] - '0' + num2c[j] - '0' + flag;
            if(temp>=10){
                temp = temp - 10;
                String s = String.valueOf(temp);
                char c = s.charAt(0);
                ans.append(c);
                flag = 1;
            }
            else{
                String s = String.valueOf(temp);
                char c = s.charAt(0);
                ans.append(c);
                flag = 0;
            }
            i--;
            j--;
        }
        while(i >= 0 && j < 0){
            int temp = 0;
            temp = num1c[i] - '0' + flag;
            if(temp>=10){
                temp = temp - 10;
                String s = String.valueOf(temp);
                char c = s.charAt(0);
                ans.append(c);
                flag = 1;
            }
            else{
                String s = String.valueOf(temp);
                char c = s.charAt(0);
                ans.append(c);
                flag = 0;
            }
            i--;

        }
        while(j >= 0 && i < 0){
             int temp = 0;
            temp = num2c[j] - '0' + flag;
            if(temp>=10){
                temp = temp - 10;
                String s = String.valueOf(temp);
                char c = s.charAt(0);
                ans.append(c);
                flag = 1;
            }
            else{
                String s = String.valueOf(temp);
                char c = s.charAt(0);
                ans.append(c);
                flag = 0;
            }
            j--;
        }
        if(flag == 1){
            ans.append('1');
        }
        return ans.reverse().toString();




    }
}
