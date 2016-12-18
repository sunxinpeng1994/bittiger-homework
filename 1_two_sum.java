Last login: Sun Dec 18 07:43:42 on ttys000
XinpengdeMacBook-Pro:~ xinpengsun$ ls
Applications	Documents	Library		Music		Public
Desktop		Downloads	Movies		Pictures	eclipse
XinpengdeMacBook-Pro:~ xinpengsun$ Desktop
-bash: Desktop: command not found
XinpengdeMacBook-Pro:~ xinpengsun$ cd /Users/apple/Desktop/
-bash: cd: /Users/apple/Desktop/: No such file or directory
XinpengdeMacBook-Pro:~ xinpengsun$ cd Desktop
XinpengdeMacBook-Pro:Desktop xinpengsun$ bittiger-homework
-bash: bittiger-homework: command not found
XinpengdeMacBook-Pro:Desktop xinpengsun$ ls
CV_Xinpeng SUN.doc
Game Design
Intro to Database System
Java数据结构和算法.（第二版）.pdf
Matlab 2012b下载地址及破解安装教程.pdf
SAMPLE (Cleaned) copy.pdf
[java编程思想中文(第4版)]-2007.pdf
bittiger-homework
cv_ppt by zjm
屏幕快照 2016-12-13 21.48.34.png
XinpengdeMacBook-Pro:Desktop xinpengsun$ bittiger-homework
-bash: bittiger-homework: command not found
XinpengdeMacBook-Pro:Desktop xinpengsun$ ls
CV_Xinpeng SUN.doc
Game Design
Intro to Database System
Java数据结构和算法.（第二版）.pdf
Matlab 2012b下载地址及破解安装教程.pdf
SAMPLE (Cleaned) copy.pdf
[java编程思想中文(第4版)]-2007.pdf
bittiger-homework
cv_ppt by zjm
屏幕快照 2016-12-13 21.48.34.png
XinpengdeMacBook-Pro:Desktop xinpengsun$ cd bittiger-homework
XinpengdeMacBook-Pro:bittiger-homework xinpengsun$ vim 1_two_sum.java

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                ans[0] = map.get(nums[i]);
                ans[1] = i;
                return ans;
            }
            else{
                map.put(target-nums[i],i);
            }
            
        }
        return ans;
    }
}
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               

