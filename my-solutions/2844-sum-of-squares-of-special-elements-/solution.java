class Solution {
    public int sumOfSquares(int[] nums) {
        int s=0;
        for(int i=1;i<=nums.length;i++){
            if(i!=0 && nums.length%i==0){
                int sq=nums[i-1]*nums[i-1];
                s+=sq;
            }
        }
        return s;
    }
}
