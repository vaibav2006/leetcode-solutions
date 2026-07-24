class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(words[i].length()==1){
                return words[i];
            }
            boolean isPal=true;
            for(int j=0;j<words[i].length()/2;j++){
                while(words[i].charAt(j)!=words[i].charAt(words[i].length()-j-1)){
                    isPal=false;
                    break;
                }
            }
            if(isPal==true){
                return words[i];
            }
        }
        return "";
    }
}
