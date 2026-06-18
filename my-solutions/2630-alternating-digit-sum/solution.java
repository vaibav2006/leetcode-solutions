class Solution {
    public int alternateDigitSum(int n) {
        int s1=0,s2=0,c=0;
        while(n>0){
            int m=n%10;
            if(c%2==0){
                s1+=m;
            }
            else{
                s2+=m;
            }
            n=n/10;
            c++;
            
        }
        if(c%2==0) return s2-s1;
        else return s1-s2;
    }
}
