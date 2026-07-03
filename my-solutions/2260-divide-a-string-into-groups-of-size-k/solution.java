class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> l=new ArrayList<>();
        if(s.length()%k==0){
        for(int i=0;i<s.length();i+=k){
            if(i+k<=s.length()) l.add(s.substring(i,i+k));
        }
    }
    else{
    for(int i=0;i<s.length();i+=k){
            if(i+k<=s.length()) l.add(s.substring(i,i+k));
        }
    int mod=s.length()%k;
    int o=k-s.length()%k;
    String a="";
    for(int i=s.length()-mod;i<s.length();i++){
        a+=s.charAt(i);
        
    }
    
    for(int i=s.length()-mod+1;i<s.length()+o;i++){
        
        if(i>=s.length()){
            a+=fill;
        }
        
    }
    l.add(a);

    
    }
    
    String[] st=new String[l.size()];

      for(int i=0;i<st.length;i++){
        st[i]=l.get(i);
      }
    return st;
    }
}
