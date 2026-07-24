class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        if(min==max){
            return min;
        }
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=max/2;i++){
            if(min%i==0 && max%i==0){
                l.add(i);
            }
        }
        System.out.println(l);
        return l.get(l.size()-1);
    }
}
