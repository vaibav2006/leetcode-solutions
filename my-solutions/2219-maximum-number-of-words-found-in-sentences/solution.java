class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        String[] c;
        for(int i=0;i<sentences.length;i++){
            c=sentences[i].split(" ");
            if(c.length>max){
                max=c.length;
            }
        }
       
        return max;
    }
}
