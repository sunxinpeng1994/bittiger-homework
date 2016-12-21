public class Solution {
    public String reverseWords(String s) {
        String[] temp = s.split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i = temp.length - 1; i>=0; i--){
            ans.append(temp[i]);
            ans.append(' ');
        }
        return ans.toString().trim();
    }
}