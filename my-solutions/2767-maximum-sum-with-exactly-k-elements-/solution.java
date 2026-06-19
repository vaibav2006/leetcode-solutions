class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int l=max;
        for(int i=1;i<k;i++){
            l+=(max+i);
        }
        return l;
    }
}
