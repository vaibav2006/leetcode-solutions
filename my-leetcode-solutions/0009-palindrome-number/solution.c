bool isPalindrome(int x) {
    long int r,num;
        if(x<0)
            return false;
        else{
            r=0;
            num=x;
            while(x!=0){
                r=r*10+x%10;
                x=x/10;
            }
            return r==num;

        }
}
