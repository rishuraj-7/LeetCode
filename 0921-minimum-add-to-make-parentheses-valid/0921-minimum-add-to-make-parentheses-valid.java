class Solution {
    public int minAddToMakeValid(String s) {
        int open=0,ad=0;
        for(char x:s.toCharArray()){
            if(x=='('){
                open++;
            }else if(open>0){
                open--;
            }
            else{
                ad++;
            }
        }
        return ad+open;
    }
}