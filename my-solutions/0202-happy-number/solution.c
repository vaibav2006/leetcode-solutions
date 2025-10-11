int check(int n){
    int s=0;
    while(n>0){
        int d=n%10;
        s+=d*d;
        n/=10;

    }
   return s;
}



bool isHappy(int n) {
    if(n<=0){
        return 0;
    }
   
    while(n!=1&&n!=4){
        n=check(n);  
    }
    if(n==1){
        return 1;
    }
    return 0;
    // return n==1;
    
}
