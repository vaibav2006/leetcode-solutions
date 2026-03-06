class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            count++;
        }
        for(int i=count;i<n;i++){
            arr[i]=nums[i-count];
        }
        System.out.println(count);
        return arr;
    }
}
