class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int c=0;
        if(sum%k==0){
            return 0;
        }
        else{
            for(int i=sum; ;i--) { 
                c++;
                 if (i%k==0) { 
                        break;
                    } 
            }
        }
        return c-1;
    }
}
