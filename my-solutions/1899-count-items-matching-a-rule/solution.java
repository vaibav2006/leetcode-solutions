class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        for(List<String> x : items){
            if(ruleKey.equals("type") && x.get(0).equals(ruleValue) ){
                c++;
            }
            if(ruleKey.equals("color") && x.get(1).equals(ruleValue) ){
                c++;
            }
            if(ruleKey.equals("name") && x.get(2).equals(ruleValue) ){
                c++;
            }

        }
        return c;
    }
}
