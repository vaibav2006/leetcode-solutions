class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int dif=0;
        int max=Integer.MIN_VALUE;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            dif=Math.abs(nums[i]-nums[i+1]);
            System.out.println(dif);
            l.add(dif);
            
        }
        l.add(Math.abs(nums[n-1]-nums[0]));
        for(int x:l){
            if(x>max){
                max=x;
            }
        }
        
        return max;
    }
}
