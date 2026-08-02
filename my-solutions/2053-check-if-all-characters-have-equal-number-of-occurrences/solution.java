class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                hs.add(freq[i]);
            }
        }
        if(hs.size()==1){
            return true;
        }
        return false;
    }
}
