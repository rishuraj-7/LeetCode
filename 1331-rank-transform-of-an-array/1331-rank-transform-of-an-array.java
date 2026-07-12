class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr1=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr1);
        int rank=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr1){
            if(!map.containsKey(x)){
                map.put(x,rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}