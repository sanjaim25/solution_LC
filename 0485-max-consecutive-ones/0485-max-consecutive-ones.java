class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int c=0;
        int max=0;
     for(int i=0;i<arr.length;i++){
        if(arr[i]==1){
            c++;
        }
        else{
            c=0;
        }
        max=Math.max(c,max);
     }   
     return max;
    }
}