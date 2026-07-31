class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans=strs[0];
        for(String s:strs){
            while(s.indexOf(ans)!=0){
                ans=ans.substring(0,ans.length()-1);
            }
        }
        return ans;
    }
}