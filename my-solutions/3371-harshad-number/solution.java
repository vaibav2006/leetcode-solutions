class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s=0,b=x;
        while(x>0){
            int m=x%10;
            s+=m;
            x=x/10;
        }
        System.out.println(s);
        if(b%s==0){
            return s;
        }
        return -1;
    }
}
