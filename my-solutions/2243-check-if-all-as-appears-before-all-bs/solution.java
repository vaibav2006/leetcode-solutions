class Solution {
    public boolean checkString(String s) {
        int i=0,j=1;
        while(j<s.length()){
            if(s.charAt(i)=='b' && s.charAt(j)=='a'){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
