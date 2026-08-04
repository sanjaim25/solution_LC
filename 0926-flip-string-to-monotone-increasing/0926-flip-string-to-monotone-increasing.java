class Solution {
    public int minFlipsMonoIncr(String s) {
        int zeros=0;
        int ones=0;
        for(char ch:s.toCharArray()){
            if(ch=='0'){
                zeros++;
            }
        }
        int out=zeros;
        for(char ch:s.toCharArray()){
            if(ch=='0'){
                zeros--;
            }else if(ch=='1'){
                ones++;
            }
            out=Math.min(out,zeros+ones);
        }
        return out;
    }
}