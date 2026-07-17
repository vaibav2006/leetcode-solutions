class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            int l=0;
            for(int j=0;j<words[i].length();j++){
                for(int k=0;k<allowed.length();k++){
                    if(words[i].charAt(j)==allowed.charAt(k)){
                        l++;
                        break;
                        
                    }
                }
                
            }
            if(l==words[i].length()) c++;
        }
        return c;
    }
}
