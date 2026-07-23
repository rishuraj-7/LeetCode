class Solution {
    public int jump(int[] nums) {
        int n=nums.length-1;
        int max=0;
        int near=0;
        int ans=0;
        while(max<n){
            int far=0;
            for(int i=near;i<=max;i++){
                far=Math.max(far,i+nums[i]);
            }
            near=max+1;
            max=far;
            ans++;
        }
        return ans;
    }
}