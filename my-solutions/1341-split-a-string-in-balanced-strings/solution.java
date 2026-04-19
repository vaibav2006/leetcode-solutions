class Solution {
    public int balancedStringSplit(String s) {
        int b=0,ans=0;
        for(Character c:s.toCharArray()){
            if(c=='L'){
                b++;
            }
            else{
                b--;
            }
            if(b==0){
                ans++;
            }
        }
        return ans;
    }
}
