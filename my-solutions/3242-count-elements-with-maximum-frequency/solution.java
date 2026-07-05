class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(Integer x:nums){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(Integer x:h.values()){
            max=Math.max(max,x);
        }
        int s=0;
        for(Integer x:h.values()){
            if(max==x){
                s+=x;
            }
        }
        return s;
    }
}
