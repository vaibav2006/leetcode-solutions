class Solution {
    public int countDigits(int num) {
        List<Integer> l=new ArrayList<>();
        int num1=num;
        while(num>0){
            int n=num%10;
            l.add(n);
            num/=10;
        }
        int c=0;
        for(int i=0;i<l.size();i++){
            int x=l.get(i);
            if(num1%x==0){
                c++;
            }
        }
        return c;
    }
}
