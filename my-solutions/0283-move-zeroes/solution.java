class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int c=0;
        for(int x:nums){
            if(x!=0){
                l.add(x);
                
            }
            else{
                c++;
            }
        }
        for(int i=0;i<c;i++){
            l.add(0);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=l.get(i);
        }

    }
}
