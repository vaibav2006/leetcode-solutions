class Solution {
    public int percentageLetter(String s, char letter) {
        int n=s.length();
        int c=0;
        for(Character x:s.toCharArray()){
            if(x==letter){
                c++;
            }
        }
        int d=c*100;
        int e=d/n;
        return e;
    }
}
