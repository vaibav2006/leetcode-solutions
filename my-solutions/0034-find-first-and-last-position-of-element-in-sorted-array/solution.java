class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        int c=-1;
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=target){
                d++;
            }
        }
        if(d==nums.length){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            c++;
            if(nums[i]==target){
                break;
            }
        }
        int o=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                o=i;
                break;
            }
        }
        ans[0]=c;
        ans[1]=o;
        return ans;
    }
}
