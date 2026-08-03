class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb=new StringBuilder();
        if(num==0) return "0";
        if(num<0){
            int n=Math.abs(num);
            while(n>0){
            int k=n%7;
            sb.append(String.valueOf(k));
            n/=7;
            }
            String st="-"+sb.reverse().toString();
            return st;
        }
        while(num>0){
            int k=num%7;
            sb.append(String.valueOf(k));
            num/=7;
        }
        return sb.reverse().toString();
    }
}
