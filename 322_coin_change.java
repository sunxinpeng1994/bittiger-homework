322_coin_change.java
public class Solution {
    public int coinChange(int[] coins, int amount) {
        //in fact, I am still not pretty sure how it works, only have a ambiguous frame. dp[i] means the minimum number of coins we need to get to the goal. we use dp[i] to store these datas we have calculated before so that we save the time and space.
        if(amount < 1){
            return 0;
        }
        Arrays.sort(coins);
        //core logic
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int coin : coins){
            for(int i = coin; i <= amount; i++){
                if(dp[i - coin] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE? -1: dp[amount];
    }
}
