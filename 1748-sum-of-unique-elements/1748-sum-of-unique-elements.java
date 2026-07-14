class Solution {
    public int sumOfUnique(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
        int c=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c==1){
               sum+=arr[i];
            }
        }
        return sum;
    }
}