class Solution {
    public int[] sumZero(int n) {
        int[] ar1=new int[n];
        int k=0;
        for(int i=1;i<=n/2;i++){
            ar1[k++]=i;
            ar1[k++]=-i;
        }

        return ar1;
    }
}
