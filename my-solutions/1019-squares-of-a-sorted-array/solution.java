class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ar=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int n=Math.abs(nums[i]);
            int sq=n*n;
            ar[i]=sq;
        }
        Arrays.sort(ar);
        return ar;
    }
}
