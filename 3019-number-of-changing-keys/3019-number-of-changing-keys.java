class Solution {
    public int countKeyChanges(String s) {
        String ans =s.toLowerCase();
        int c=0;
        for(int i=1;i<ans.length();i++){
            if(ans.charAt(i)!=ans.charAt(i - 1)){
                c++;
            }
        }
        return c;
    }
}