class Solution {
    public boolean stoneGame(int[] p) {
        int n=p.length;
        int[] dp=p.clone();
        for(int l=2;l<=n;l++){
            for(int i=0;i+l-1<n;i++){
                int j=i+l-1;
                dp[i]=Math.max(p[i]-dp[i+1],p[j]-dp[i]);
            }
        }
        return dp[0]>0;
    }
}