class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int rem=0;
        for(char x:s.toCharArray()){
            if(x=='('){
                if(rem>0){
                    ans.append(x);
                }
            rem++;
            }    
            else{
                    rem--;
                    if(rem>0){
                        ans.append(x);
                    }
                }
        }
        return ans.toString();
    }
}