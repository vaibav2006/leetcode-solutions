class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr=s.split(" ");
        String a="";
        for(int i=0;i<k;i++){
            a+=arr[i];
            a+=" ";
        }
        return a.trim();
    }
    }

