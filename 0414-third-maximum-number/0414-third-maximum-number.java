class Solution {
    public int thirdMax(int[] arr) {
    Arrays.sort(arr);
    int c=1;
    int max=arr[arr.length -1];
    for(int i=arr.length-2;i>=0;i--){
        if(arr[i]!=max){
            c++;
            max=arr[i];
            if(c==3){
                return max;
            }
        }
    }
    return arr[arr.length - 1];
    }
}