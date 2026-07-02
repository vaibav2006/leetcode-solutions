class Solution {
    public int[] leftRightDifference(int[] nums) {
        int res[]=new int[nums.length];
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        l1.add(0);
        l1.add(nums[0]);
        int sum=nums[0];
        for(int i=0;i<nums.length-2;i++){
            sum+=nums[i+1];
            l1.add(sum);
        }
        int sum2=0;
        for(int i=nums.length-1;i>=1;i--){
            sum2+=nums[i];
            l2.add(sum2);
        }
        
        Collections.reverse(l2);
        l2.add(0);
        for(int i=0;i<res.length;i++){
            res[i]=Math.abs(l1.get(i)-l2.get(i));
        }
        //System.out.println(l2);
        return res;
    }
}
