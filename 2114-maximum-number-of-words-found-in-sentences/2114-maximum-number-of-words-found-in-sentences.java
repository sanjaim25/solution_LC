class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            int c=0;
            String[] st=sentences[i].split(" ");
            c=st.length;
            max=Math.max(max,c);
            
        }
        return max;

    }
}