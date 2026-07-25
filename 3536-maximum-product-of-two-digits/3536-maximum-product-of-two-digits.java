class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> dig=new ArrayList<>();
        while(n>0){
            int d=n%10;
            dig.add(d);
            n=n/10;
        }
        Collections.sort(dig);
        return dig.get(dig.size()-2)*dig.get(dig.size()-1);
    }
}