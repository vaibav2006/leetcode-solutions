class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(Integer x:nums){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        int k=0;
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            if(e.getValue()==nums.length/2){
                k=e.getKey();
            }
        }
        return k;
    }
}
