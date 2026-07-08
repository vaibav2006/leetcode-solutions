class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                int m=nums[i]%10;
                if(m==digit){
                    c++;
                }
                nums[i]/=10;
            }
        }
        return c;
    }
}
