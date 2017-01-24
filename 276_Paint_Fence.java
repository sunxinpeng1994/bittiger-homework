276_Paint_Fence.java
public class Solution {
    public int numWays(int n, int k) {
        //we are asked to paint all the posts such that no more than two adjacent fenct posts have the same color. For example, there are 3 posts to be painted. we have k choices for the first one, when we at the second one, we still have k choices which reasults in k*k posibilities. when we consider the third post, there are two cases: 
        //(1). if colors of 1 and 2 are the same, now we have k-1 choices
        //(2). if they are different, we have k choices. 
        // in other words, either 3 is different from 1, or 3 is different from 2. 
        // we can conclude that dp[3] = (k - 1)*(dp[1]+dp[2])
        int[] dp = new int[4];
        dp[0] = 0;
        dp[1] = k;
        dp[2] = k * k;
        if(n <=2){
            return dp[n];
        }
        for(int i = 3; i <= n; i++){
            dp[3] = (k - 1) * (dp[1] + dp[2]);
            dp[1] = dp[2];
            dp[2] = dp[3];
        }
        return dp[3]; 
    }
}