class Solution {
    public int maxDepth(String s) {
        int ans=Integer.MIN_VALUE;
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
            }else if(c==')'){
                count--;
            }
            if(ans<count){
                ans=count;
            }
        }
        return ans;
    }
}