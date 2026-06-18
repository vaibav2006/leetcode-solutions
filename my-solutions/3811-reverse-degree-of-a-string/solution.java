class Solution {
    public int reverseDegree(String s) {
        int sum=0,p=1;
        for(int i=1;i<=s.length();i++){
            int c= 123-s.charAt(i-1);
           p=c*i;
            sum=sum+p;
        }
        return sum;
    }
}
