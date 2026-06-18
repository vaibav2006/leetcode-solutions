class Solution {
    public int countEven(int num) {
        int c=0;
        
        
        for(int i=2;i<=num;i++){
            int n=i;
            int s=0;
            while(n>0){
                int m=n%10;
                s+=m;
                n=n/10;
                
                
            }    
            if(s%2==0){
                    c++;
                }
        }
        return c;
    }
}
