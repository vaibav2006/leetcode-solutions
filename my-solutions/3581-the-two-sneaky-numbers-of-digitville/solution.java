class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2];
        boolean[] b=new boolean[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(b[nums[i]]==true) ans[k++]=nums[i];
            else b[nums[i]]=true;
        }
        return ans;

    }
}
