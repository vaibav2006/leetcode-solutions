class Solution {
    public String convertDateToBinary(String date) {
        String[] ar=date.split("-");
        String ans="";
        for(int i=0;i<ar.length;i++){
            int n=Integer.parseInt(ar[i]);
            StringBuilder sb=new StringBuilder();
            while(n>0){
                int r=n%2;
                
                sb.append(String.valueOf(r));
                n/=2;
            }
            sb.reverse();
            ans+=sb.toString();
            if(i==ar.length-1){
                break;
            }
            ans+="-";
        }
        return ans;
    }
}
