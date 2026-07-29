class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0;
        if(word.length()==1) return true;
        if(word.charAt(0)>=65 && word.charAt(0)<=91){
                c++;
                
            }
        
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)>=65 && word.charAt(i)<=91){
                c++;
            }
            
        }
        System.out.println(c);
        if(c==0) return true;
        if (c == 1 && (word.charAt(0) >= 65 && word.charAt(0) <= 91)) return true;
        if(c==word.length()) return true;
        return false;
    }
}
