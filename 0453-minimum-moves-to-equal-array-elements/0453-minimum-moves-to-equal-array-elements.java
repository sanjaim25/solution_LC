class Solution {
    public int minMoves(int[] nums) {
    int min=nums[0];
    for(int n:nums){
        if(n<min){
           min=n;
        }
    }
    int c=0;
    for(int n:nums){
        c+=n-min;
    }
    return c;
    }
}