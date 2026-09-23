class Solution {
    public int minOperations(int[] nums, int x) {
        int psum=0;
        for(int t:nums){
            psum+=t;
        }
        int t=psum-x;
        int l=0;
        int sum=0;
        int ans=-1;
        for(int r=0;r<nums.length;++r){
            sum=sum+nums[r];
            while(l<=r && sum>t){
                sum=sum-nums[l++];
            }
            if(sum==t){
                ans=Math.max(ans,r-l+1);
            }
        }
        if(ans!=-1){
            return nums.length-ans;
        }
        return -1;

    }
}