class Solution {
    public boolean checkIfPangram(String sentence) { 
        Set<Character>s=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            char c=sentence.charAt(i);
            s.add(c);
        }
        if(s.size()==26){
            return true;
        }
        return false;
    }
}
