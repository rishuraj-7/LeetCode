class Solution {
    public int minimumPushes(String word) {
        int f[]=new int[26];
        for(char x:word.toCharArray()){
            f[x-'a']++;
        }
        Arrays.sort(f);
        int ans=0;
        int count=0;
        for(int i=25;i>=0;i--){
            int push=(count/8)+1;
            ans+=(f[i]*push);
            count++;
        }
        return ans;
    }
}