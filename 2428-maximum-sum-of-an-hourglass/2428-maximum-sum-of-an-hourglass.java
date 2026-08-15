class Solution {
    public int maxSum(int[][] g) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if((i-1)>=0 && (j-1)>=0 && (j+1)<g[0].length && (i+1)<g.length){
                int sum=g[i-1][j-1]+g[i-1][j]+g[i-1][j+1]+g[i][j]+g[i+1][j-1]+g[i+1][j]+g[i+1][j+1];
                max=Math.max(max,sum);
            }
            }
        }
        return max;

    }
}