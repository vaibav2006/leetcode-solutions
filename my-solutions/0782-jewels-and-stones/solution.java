class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int b=0;
        for(Character c:jewels.toCharArray()){
            for(Character d:stones.toCharArray()){
                if(c==d){
                    b++;
                }
            }
        }
        return b;
    }
}
