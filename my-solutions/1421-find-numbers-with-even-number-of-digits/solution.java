class Solution {
    public int findNumbers(int[] nums) {
        int ct=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int c=0;
            while(n>0){
                int k=n%10;
                c++;
                n/=10;
            }
            if(c%2==0){
                ct++;
            }
            c=0;
        }
        return ct;
    }
}
