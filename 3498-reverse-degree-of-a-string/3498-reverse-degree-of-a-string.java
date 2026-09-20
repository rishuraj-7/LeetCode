class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=1;i<=s.length();i++){
            char x=s.charAt(i-1);
            int temp=26-(x-'a');
            ans+=temp*(i);
        }
        return ans;
    }
}