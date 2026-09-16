class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        String[] dir=path.split("/");
        for(String d:dir){
            if(d.equals(".")||d.isEmpty()){
                continue;
            }else if(d.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }else{
                s.push(d);
            }
        }
        return "/"+String.join("/",s);
    }
}