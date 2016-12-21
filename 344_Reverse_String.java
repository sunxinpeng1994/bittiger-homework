public class Solution {
    public String reverseString(String s) {
        //corner case
        if(s == null || s.length() == 0){
            return s;
        }
        
        //core logic
        int len = s.length();
        char[] schar = s.toCharArray();
        for(int i = 0; i<len/2; i++){
            char temp = schar[i];
            schar[i] = schar[len-1-i];
            schar[len-1-i] = temp;
        }
        String ans = new String(schar);
        return ans;
    }
}