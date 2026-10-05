class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for (char ch:s.toCharArray()) {
            if(ch=='(') {
                stack.push(0);
            }else{
                int inside=stack.pop();
                if(inside==0) {
                    //A+B
                    stack.push(stack.pop()+1);
                }else{
                    //2*A
                    stack.push(stack.pop()+2*inside);
                }
            }
        }
        return stack.pop();
    }
}