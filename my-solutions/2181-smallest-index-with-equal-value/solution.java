class Solution {
    public int smallestEqual(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
               return i;
            }
        }
        //if(c>=0) return c;
        return -1;
    }
}
