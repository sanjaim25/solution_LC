class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashSet <Integer> set=new HashSet<>();
        for(int m:nums){
            set.add(m);
        }
        boolean ans=true;
        if(set.size()!=n){
            ans=false;
        }
        if(ans){
            return false;
        }else{
            return true;
        }
    }
}