class Solution {
    public int longestSubsequence(int[] nums) {
        int nonz=0;
        int xor=0;
        for(int x:nums){
            xor=xor^x;
            if(xor!=0){
                nonz++;
            }
        }
        if(nonz==0){
            return 0;
        }
        if(xor!=0){
            return nums.length;
        }
        return nums.length-1;
    }
}