class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(Integer x:nums){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            if(e.getValue()>1){
                l.add(e.getKey());
            }
        }
        return l;
    }
}
