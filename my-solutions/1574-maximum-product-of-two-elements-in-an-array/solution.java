class Solution {
    public int maxProduct(int[] nums) {
        int max=0,sec=0;
        List<Integer> l=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
            if(nums[i]>max){
                max=nums[i];
                c=i;
            }
        }
        l.remove(c);
        for(int i=0;i<l.size();i++){
            if(l.get(i)>sec){
                sec=l.get(i);
            }
        }
        int a=max-1;
        int b=sec-1;
        return a*b;
    }
}
