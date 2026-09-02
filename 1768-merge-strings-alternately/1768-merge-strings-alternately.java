class Solution {
    public String mergeAlternately(String word1, String word2) {
    String output="";
    int i=0;
    int j=0;
    while(i<word1.length()&&j<word2.length()){
        output+=word1.charAt(i);
        output+=word2.charAt(j);
        i++;
        j++;
    }
    while(i<word1.length()){
        output+=word1.charAt(i);
        i++;
    }
     while(j<word2.length()){
        output+=word2.charAt(j);
        j++;
    }
    return output;
    }
}