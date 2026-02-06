class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        int i=0,sum=0;
        while(i<n){
            sum+=nums[i];
            i++;
        }
        
        int l=(n*(n+1))/2;
        return l-sum; 
    }
}
