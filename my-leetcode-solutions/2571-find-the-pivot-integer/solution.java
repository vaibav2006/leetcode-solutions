class Solution {
    public int pivotInteger(int n) {
        int sum=0;
        int idx=-1;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        int x=(int)Math.sqrt(sum);
        if(x*x==sum){
            idx=x;
        }
        return idx;
    }
}
