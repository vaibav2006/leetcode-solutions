class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==2 || nums.length==1) return -1;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[0] && nums[i]!=nums[nums.length-1]){
                c=nums[i];
                break;
            }
        }
        return c;
    }
}
