class Solution {
    public boolean isBalanced(String num) {
        int s=0,s2=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0){
                int m=Character.getNumericValue(num.charAt(i));
                s+=m;
            }
            else{
                 int m=Character.getNumericValue(num.charAt(i));
                s2+=m;
            }
        }
        if(s==s2) return true;
        return false;
    }
}
