class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int count=0;
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    count++;
            }
        }
        max=count;
        for(int i=k;i<s.length();i++){
            char c=s.charAt(i-k);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    count--;
            }
            char c1=s.charAt(i);
            if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u'){
                    count++;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}