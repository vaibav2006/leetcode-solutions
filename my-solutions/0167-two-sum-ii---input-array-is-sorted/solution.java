class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        int[] ans=new int[2];
        int k=0;
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                ans[k++]=i+1;
                ans[k++]=j+1;
                return ans;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}
