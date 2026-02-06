class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] n=new int[2];
        int i=0,j=1,k=0,l=0;
        while(i<j){
            j=i+1;
            while(j<=nums.length-1){
                if((nums[i]+nums[j])==target){
                    k=i;
                    l=j;
                }
                j++;
            }
            i++;
        }
        n[0]=k;
        n[1]=l;
        return n;
    }
}
