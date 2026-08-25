class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int c=k;
        while(set.contains(c)){
            c=c+k;
        }
        return c;
    }
}