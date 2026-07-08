class Solution {
    public String frequencySort(String s) {
        String st="";
        HashMap<Character,Integer> h=new HashMap<>();
        for(Character c:s.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        int i=0;
        int max=Integer.MIN_VALUE;
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(h.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        for(Map.Entry<Character,Integer> e: list){
            int m=e.getValue();
            char c=e.getKey();
            for(int j=0;j<m;j++){
                st+=c;
            }
        }
        return st;
    }
}
