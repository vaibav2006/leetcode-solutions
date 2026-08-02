class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=pref.length();
        String a="";
        int c=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<n;j++){
                if(s.length()>=pref.length()){
                    a+=s.charAt(j);
                }
            }
            if(a.equals(pref)){
                c++;
                a="";
            }
            a="";
        }
        return c;
    }
}
