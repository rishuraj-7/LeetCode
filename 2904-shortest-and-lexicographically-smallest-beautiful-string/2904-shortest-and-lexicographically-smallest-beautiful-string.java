class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            int count=0;
            for(int j=i;j<n;j++){
                sb.append(s.charAt(j));
                if(s.charAt(j)=='1'){
                    count++;
                }
                if(count>k){
                    break;
                }
                if(count==k){
                    String cur=sb.toString();
                    if(ans.isEmpty() || cur.length()<ans.length() || (cur.length()==ans.length()&&cur.compareTo(ans)<0)){
                        ans=cur;
                    }
                }
            }
        }
        return ans;
    }
}