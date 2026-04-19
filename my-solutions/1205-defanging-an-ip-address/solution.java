class Solution {
    public String defangIPaddr(String address) {
        String a="";
        for(Character s:address.toCharArray()){
            if(s!='.'){
                a+=s;
            }
            else{
            a+="[";
            if(s=='.'){
                a+=".]";
            }
        }
        
    }
    return a;
    }
}
