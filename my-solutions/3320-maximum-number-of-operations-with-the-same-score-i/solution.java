class Solution {
    public int maxOperations(int[] nums) {
        int i=0,j=1;
        int c=0;
        int initsum=nums[i]+nums[j];
        while(i<nums.length-1 && j<nums.length){
            int s=nums[i]+nums[j];
            i+=2;
            j+=2;
            if(s==initsum){
                c++;
            }
            else{
                break;
            }
        }
        return c;
    }
}
