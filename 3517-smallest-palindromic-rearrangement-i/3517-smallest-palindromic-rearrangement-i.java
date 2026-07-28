class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        StringBuilder ans=new StringBuilder();
        StringBuilder left=new StringBuilder();
        int[] f=new int[26];
        for(char c:s.toCharArray()){
            f[c-'a']++;
        }
        char mid=0;
        for(int i=0;i<f.length;i++){
            if(f[i]%2==1){
                mid=(char)('a'+i);
            }
            for(int j=0;j<f[i]/2;j++){
                left.append((char)('a'+i));
            }
        }
        ans.append(left);
        if(mid!=0){
            ans.append(mid);
        }
        ans.append(new StringBuilder(left).reverse());
        return ans.toString();
    }
}