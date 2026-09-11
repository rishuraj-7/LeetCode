class Solution {
    public int totalNumbers(int[] d) {
       Set<Integer> set=new HashSet<>();
        int n=d.length;
        
        for(int i=0;i<n;i++){
            if(d[i]==0) continue;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                for(int k=0;k<n;k++){
                    if(k==i||k==j) continue;
                    if(d[k]%2!=0) continue;
                    int no=(d[i]*100)+(d[j]*10)+(d[k]);
                     set.add(no);
                }
                
            }
        }
        return set.size();

    }
}