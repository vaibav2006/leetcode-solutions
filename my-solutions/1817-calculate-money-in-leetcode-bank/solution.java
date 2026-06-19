class Solution {
    public int totalMoney(int n) {
        int sum=0;
        if(n<=7){
            for(int i=1;i<=n;i++){
                sum+=i;
            }
        }
        else{
            int l=n%7;
            int m=n/7;
            for(int j=0;j<m;j++){
                for(int k=1;k<=7;k++){
                    sum+=(j+k);
                }
            }
            for(int j=1;j<=l;j++){
                sum+=(m+j);
            }
        }
        return sum;
    }
}




