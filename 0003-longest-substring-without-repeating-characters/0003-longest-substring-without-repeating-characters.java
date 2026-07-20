class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int i=0;
        int j=0;
        int ans=0;
        int[] f=new int[256];
        while(j<s.length()){
            f[s.charAt(j)]++;
            while(f[s.charAt(j)]>1){
                f[s.charAt(i)]--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        } 
        return ans;
    }
}