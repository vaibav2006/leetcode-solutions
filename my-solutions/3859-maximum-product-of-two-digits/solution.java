class Solution {
    public int maxProduct(int n) {
        List<Integer> l=new ArrayList<>();
        int s;
        while(n>0){
            s=n%10;
            l.add(s);
            n=n/10;
        }
        Collections.sort(l);
        return l.get(l.size()-1)*l.get(l.size()-2);
    }
}
