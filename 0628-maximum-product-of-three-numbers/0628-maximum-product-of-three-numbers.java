class Solution {
    public int maximumProduct(int[] nums) {
        int d1=Integer.MIN_VALUE;
        int d2=Integer.MIN_VALUE;
        int d3=Integer.MIN_VALUE;
        int s1=Integer.MAX_VALUE;
        int s2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int d=nums[i];
            if(d>d1){
                d3=d2;
                d2=d1;
                d1=d;
            }else if(d>d2){
                d3=d2;
                d2=d;
            }else if(d>d3){
                d3=d;
            }
            if(d<s1){
                s2=s1;
                s1=d;
            }else if(d<s2){
                s2=d;
            }
        }
        return Math.max(d1*d2*d3,d1*s1*s2);
    }
    
}