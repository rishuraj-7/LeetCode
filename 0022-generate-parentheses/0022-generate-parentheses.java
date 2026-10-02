class Solution {
    public void bracket(List<String> ans,int max,int o,int c,String rem){
        if(rem.length()==(2*max)){
            ans.add(rem);
            return;
        }
        if(o<max){
            bracket(ans,max,o+1,c,rem+"(");
        }
        if(c<o){
            bracket(ans,max,o,c+1,rem+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<String>();
        bracket(ans,n,0,0,"");
        return ans;
    }
}