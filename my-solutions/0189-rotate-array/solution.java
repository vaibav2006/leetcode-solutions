class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] ans=new int[nums.length];
        int n=nums.length-1;
        for(int i=0;i<k;i++){
            ans[i]=nums[n-k+i+1];
        }
        int s=k;
        for(int i=0;i<n-k+1;i++){
            ans[s++]=nums[i];
        }
        for(int i=0;i<=n;i++){
            System.out.println(ans[i]);
        }
        for(int i=0;i<=n;i++){
            nums[i]=ans[i];
        }
    }
}

