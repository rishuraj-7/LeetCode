class Solution {
    public long maxRatings(int[][] units) {
        long min1=Long.MAX_VALUE;
        long min2=Long.MAX_VALUE;
        long sum2=0;
        long sum=0;
        for(int[] d:units){
            int mini1=Integer.MAX_VALUE;
            int mini2=Integer.MAX_VALUE;
            for(int x:d){
                if(x<mini1){
                    mini2=mini1;
                    mini1=x;
                }else if(x<mini2){
                    mini2=x;
                }
            }
            if(d.length==1){
                mini2=0;
            }
            sum2=sum2+mini2;
            sum+=mini1;
            min1=Math.min(min1,mini1);
            min2=Math.min(min2,mini2);
            
        }
        return Math.max(sum,(long)min1+sum2-min2);
    }
}