class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int start=Integer.MAX_VALUE;;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.min(start,nums[i]);
            end=Math.max(end,nums[i]);
            set.add(nums[i]);
        }
        for(int i=start;i<=end;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}