class Solution {
    public String generateTheString(int n) {
        String s="";
        for(int i=0;i<n;i++){
            if(n%2!=0){
                s+="a";
            }
            
        }
        if(!s.equals("")){
            return s;
        }
        String a="";
        for(int i=0;i<n-1;i++){
            a+="a";
        }
        a+="b";
        return a;
    }
}
