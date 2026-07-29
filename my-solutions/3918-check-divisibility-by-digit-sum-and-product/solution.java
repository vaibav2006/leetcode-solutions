class Solution {
    public boolean checkDivisibility(int n) {
        int s=0,p=1;
        int temp=n;
        while(n>0){
            int k=n%10;
            s+=k;
            p*=k;
            n/=10;
        }
        int ans=s+p;
        if(temp%ans==0){
            return true;
        }
        else{
            return false;
        }
    }
}
