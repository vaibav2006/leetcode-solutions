class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
        for(Integer x:arr){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(Integer x:h.values()){
            if(!hs.contains(x)){
                hs.add(x);
            }
            else{
                hs1.add(x);
            }
        }
        if(hs1.size()==0){
            return true;
        }
        else
        return false;
    }
}
