class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        for(String x:word1){
            s1+=x;
        }
        String s2="";
        for(String x:word2){
            s2+=x;
        }
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}
