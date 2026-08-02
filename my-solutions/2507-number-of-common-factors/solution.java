class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        int max=Math.max(a,b);
        for(int i=1;i<=max/2;i++){
            if(a%i==0 && b%i==0){
                c++;
            }
        }
        if(a==b) return c+1;
        return c;
    }
}
