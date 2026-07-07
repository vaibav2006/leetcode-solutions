class Solution {
    public long sumAndMultiply(int n) {
        if(n<10) return (long)n*n;
        long sum=0;
        String st="";
        while(n>0){
            long s=n%10;
            if(s!=0){
                sum+=s;
                st+=Long.toString(s);
                
            }
            n/=10;
        }
        String str=new StringBuilder(st).reverse().toString();
        long lt=Long.parseLong(str)*sum;
        return lt;
    }
}
