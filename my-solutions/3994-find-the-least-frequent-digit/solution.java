class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq=new int[10];
        while(n>0){
            int k=n%10;
            freq[k]++;
            n/=10;

        }
        int min=Integer.MAX_VALUE;
        int val=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                if(freq[i]<min){
                    min=freq[i];
                    val=i;
                }
            }

        }
        return val;
    }
}
