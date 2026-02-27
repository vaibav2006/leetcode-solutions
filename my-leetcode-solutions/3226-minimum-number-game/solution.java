class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr=new int[nums.length];
        Arrays.sort(nums);
        int j;
        for(int i=0;i<nums.length-1;i+=2){
            
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
        }
        
        return nums;
    }
}
