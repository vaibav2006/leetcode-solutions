class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(Integer x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        int max=0,n;
        int[] an=new int[k];
        List<Map.Entry<Integer,Integer>> l = new ArrayList<>(hm.entrySet());
        l.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        Map<Integer,Integer> hm1 = new LinkedHashMap<>();
        for (Map.Entry<Integer,Integer> e:l) {
            hm1.put(e.getKey(),e.getValue());
        }
        List<Integer> keys=new ArrayList<>(hm1.keySet());
        for(int i=0;i<k;i++){
            an[i]=keys.get(i);
        }
        return an;
    }
}
