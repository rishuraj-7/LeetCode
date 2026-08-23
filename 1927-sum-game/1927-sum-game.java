class Solution {
    public boolean sumGame(String num) {
        int left=0;
        int right=0;
        for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
            int v;
            if(c=='?'){
                v=9;
            }else{
                v=2*(c-'0');
            }
            if(i<num.length()/2){
                left+=v;
            }else{
                right+=v;
            }
        }
        return left!=right;
    }
}