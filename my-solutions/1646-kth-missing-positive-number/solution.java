class Solution {
    public int findKthPositive(int[] nums, int k) {
        List<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        int c=0;
     
        int max=nums[nums.length-1];
        
        for(int i=1;i<=2100;i++){
            boolean flag=false;
            for(int j=0;j<nums.length;j++){
            if(nums[j]==i){
                flag=true;
                break;
      
            }
            }
            if(!flag){
                l.add(i);
            }
        }
        int r=0;
        for(int i=0;i<l.size();i++){
            if(i==k){
                r=l.get(i-1);
            }
        }
        return r;
    }
}
