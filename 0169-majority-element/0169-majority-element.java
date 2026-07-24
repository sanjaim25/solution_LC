class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
            // System.out.print(map.get(i));
        }
        for (int i:nums){
            if (map.get(i)>nums.length/2){
                return i;
            }
            // System.out.print(map.get(i));
        }
        return 0;
    }
}