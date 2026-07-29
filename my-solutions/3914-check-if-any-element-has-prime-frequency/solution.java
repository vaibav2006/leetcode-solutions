class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(Integer x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(Integer x:hm.values()){
            if(isPrime(x)){
                return true;
            }
            
        }
        return false;

    }
    boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
