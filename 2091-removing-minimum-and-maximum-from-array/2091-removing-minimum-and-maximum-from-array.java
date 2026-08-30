class Solution {
    public int minimumDeletions(int[] nums) {
        int mini=0;
        int maxi=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                mini=i;
                min=nums[i];
            }
            if(max<nums[i]){
                maxi=i;
                max=nums[i];
            }
        }
        int l=Math.min(mini,maxi);
        int r=Math.max(mini,maxi);
        int f=r+1;
        int b=n-l;
        int both=(l+1)+(n-r);
        return Math.min(f,Math.min(b,both));
    }
}