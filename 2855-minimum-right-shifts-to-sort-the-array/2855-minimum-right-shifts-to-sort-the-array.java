class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n=nums.size(),breakPoint=-1;
        for(int i=0;i<n;i++){
            if(nums.get(i)>nums.get((i+1)%n)){
                if(breakPoint!=-1)return -1;
                breakPoint=i;
            }
        }
        return breakPoint==-1?0:n-breakPoint-1;
    }
}