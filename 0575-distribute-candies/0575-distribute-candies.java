class Solution {
    public int distributeCandies(int[] arr) {
      int ans= arr.length/2;
      HashSet<Integer> set=new HashSet<>();
      for(int j:arr){
        set.add(j);
      }
      if(set.size()>=ans){
        return ans;
      }
      return set.size();
    }
}