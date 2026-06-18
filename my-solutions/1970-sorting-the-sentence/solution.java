class Solution {
    public String sortSentence(String s) {
        String[] s1=s.split(" ");
        String[] res=new String[s1.length];
        for(String x:s1){
            int a=x.charAt(x.length()-1)-'0'-1;
            res[a]=x.substring(0,x.length()-1);
        }
        String ans=String.join(" ",res);
        return ans;
    }
}
