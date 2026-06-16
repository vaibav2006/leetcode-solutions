class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(Integer a:arr){
            h.put(a,h.getOrDefault(a,0)+1);
        }
         int maxLucky=-1;
        for (Integer key : h.keySet()) { 
            Integer value = h.get(key);
            if (key.equals(value)) {
                maxLucky=Math.max(maxLucky, key);
            }
        }
        return maxLucky;
    }
}
