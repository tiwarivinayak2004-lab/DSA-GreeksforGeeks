class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=wt.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=1;i<=n;i++){
            for(int w=1;w<=W;w++){
                if(wt[i-1]<=w){
                    int take=dp[i-1][w-wt[i-1]]+val[i-1];
                    int skip=dp[i-1][w];
                    dp[i][w]=Math.max(take,skip);
                }else{
                    dp[i][w]=dp[i-1][w];
                }
            }
        }
        return dp[n][W];
    }
}
