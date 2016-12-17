c class Solution {
    public String addBinary(String a, String b) {
        //corner case
        if(a == null && a.length() == 0){
            return b;
        }
        if(b == null && b.length() == 0){
            return a;
        }
   
        //core logic
        int i = a.length() - 1;
        int j = b.length() - 1;
        int flag = 0;
        StringBuilder ans = new StringBuilder();
        while(i >= 0 && j >= 0){
            int temp = (int)(a.charAt(i) - '0' + b.charAt(j) - '0') + flag;
            flag = temp/2;
            temp = temp % 2;
            ans.append(temp);
            i--;
            j--;
        }
        while(i >= 0 && j < 0){
            int temp = (int)(a.charAt(i) - '0') + flag;
            flag = temp/2;
            temp = temp % 2;
            ans.append(temp);
            i--;
        }
        while(j >= 0 && i < 0){
            int temp = (int)(b.charAt(j) - '0') + flag;
            flag = temp/2;
            temp = temp % 2;
            ans.append(temp);
            j--;
        }
        if(flag == 1){
            ans.append(1);
        }
        return ans.reverse().toString();
    }
}

