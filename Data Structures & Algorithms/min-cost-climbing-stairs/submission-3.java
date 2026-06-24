class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        dp=new int [n+1];
        for(int j =0;j<n+1;j++){
            dp[j]=-1;
        }
        return Math.min(dfs(cost,0),dfs(cost,1));
    }
        public int dfs(int [] cost, int i){
        int n =cost.length;
          if(i>=n) return 0;
          if(dp[i]!=-1) return dp[i];
          

          return dp[i]=cost[i]+Math.min(dfs(cost,i+1),dfs(cost,i+2));
        }
    }

