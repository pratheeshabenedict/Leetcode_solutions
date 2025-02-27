class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int maxlen=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int a = arr[i];
                int b=arr[j];
                int length=2;
                while(set.contains(a+b)){
                    int next =a+b;
                    a=b;
                    b=next;
                    length++;
                }
                maxlen=Math.max(maxlen,length);
            }
        }
        return maxlen>=3 ? maxlen : 0;
    }
}
//store the data in set , then pick two elements ,if the picked elements
//are present in the set then increase the length count
//code is mentioned above 

