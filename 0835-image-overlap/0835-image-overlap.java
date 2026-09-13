class Solution {
    public int largestOverlap(int[][] i1, int[][] i2) {
        //jaha jaha one h usko store krenge
        ArrayList<int[]> p1=new ArrayList<>();
        ArrayList<int[]> p2=new ArrayList<>();
        for(int i=0;i<i1.length;i++){
            for(int j=0;j<i2.length;j++){
                if(i1[i][j]==1){
                    p1.add(new int[]{i,j});
                }
                if(i2[i][j]==1){
                    p2.add(new int[]{i,j});
                }
            }
        }
        int ans=0;
        //shift kitna kitna krna h
        HashMap<String,Integer> map=new HashMap<>();
        for(int[] x:p1){
            for(int[] y:p2){
                int r=y[0]-x[0];
                int c=y[1]-x[1];
                String key=r+","+c;
                int cnt=map.getOrDefault(key,0)+1;
                map.put(key,cnt);
                ans=Math.max(ans,cnt);
            }
        }
        return ans;
    }
}