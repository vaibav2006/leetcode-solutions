class Solution {
    public int differenceOfSum(int[] nums) {
        List<Integer>l=new ArrayList<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]<=9){
                l.add(nums[i]);
            }
            else{
                int n=nums[i];
                while(n>0){
                    int k=n%10;
                    l.add(k);
                    n/=10;
                }
            }
        }
        int sum1=0;
        for(Integer x:l){
            sum1+=x;
        }
        return Math.abs(sum1-sum);
    }
}
