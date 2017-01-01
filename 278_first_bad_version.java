278_first_bad_version.java
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left < right ){
            int temp = left + (right-left)/2;
            if(isBadVersion(temp)){
                right = temp;
            }
            else{
                left = temp+1;
            }
        }
        return left;
        
    }
}