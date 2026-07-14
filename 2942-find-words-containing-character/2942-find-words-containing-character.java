class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ar=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            char[] arr=words[i].toCharArray();
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(x==arr[j]){
                   ar.add(i);
                   break;
                
                }
            }
            
        }
        return ar;
    }
}