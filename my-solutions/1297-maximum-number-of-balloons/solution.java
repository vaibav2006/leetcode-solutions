class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,o=0,n=0;
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(c=='b'){
                b++;
            }
            if(c=='a'){
                a++;
            }
            if(c=='l'){
                l++;
            }
            if(c=='o'){
                o++;
            }
            if(c=='n'){
                n++;
            }
        }
        l=l/2;
        o=o/2;

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}
