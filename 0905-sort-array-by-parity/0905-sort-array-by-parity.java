class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int count=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[count++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                ans[count++]=nums[i];
            }
        }
        return ans;
    }
}