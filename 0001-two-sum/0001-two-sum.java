class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int no=target-nums[i];
            if(map.containsKey(no)&&map.get(no)!=i){
                return new int[]{i,map.get(no)};
            }
        }
        return new int[]{};
        

    }
}