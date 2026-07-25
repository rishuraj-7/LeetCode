class Solution {
    public boolean isMonotonic(int[] nums) {
        int check=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                if(check==0){
                    check=1;
                }else if(check==-1){
                    return false;
                }
            }else if(nums[i-1]>nums[i]){
                if(check==0){
                    check=-1;
                }else if(check==1){
                    return false;
                }
            }
        }
        return true;
        
    }
}