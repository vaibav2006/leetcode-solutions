class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb=new StringBuilder(num);
        sb.reverse();
        String ans="";
        if(sb.charAt(0)!='0') return num;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='0'){
                sb.deleteCharAt(i);
                
                if(sb.charAt(i)!='0' && i<sb.length()){
                    break;
                }
                i--;
            }
        }
        for(int i=sb.length()-1;i>=0;i--){
            ans+=sb.charAt(i);
        }
        return ans;
    }
}
