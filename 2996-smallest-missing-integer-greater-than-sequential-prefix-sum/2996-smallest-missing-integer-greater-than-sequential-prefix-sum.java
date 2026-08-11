class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
    
        Set<Integer> set=new HashSet<>(nums.length);
        for(int x:nums){
            set.add(x);
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]-1){
                sum+=nums[i];
            }else{
                break;
            }
        }
         while(set.contains(sum)){
             sum++;
         }
        return sum;

    }
}