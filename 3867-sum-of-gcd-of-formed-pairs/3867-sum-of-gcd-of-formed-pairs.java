class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int max[]=new int[n];
        int mx=0;
        for(int i=0;i<n;i++){
            if(nums[i]>mx){
                mx=nums[i];
                max[i]=mx;
            }else{
                max[i]=mx;
            }
        }
        long[] pgcd=new long[n];
        for(int i=0;i<n;i++){
            pgcd[i]=gcd(nums[i],max[i]);
        }
        Arrays.sort(pgcd);
        System.out.println(Arrays.toString(max));
        System.out.println(Arrays.toString(pgcd));
        long sum=0;
        int l=0;
        int r=n-1;
        while(l<r){
            sum=sum+(long)gcd(pgcd[l],pgcd[r]);
            l++;
            r--;
        }
        return sum;
    }
    public long gcd(long a,long b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}