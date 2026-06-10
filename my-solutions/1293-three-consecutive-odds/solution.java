class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int f=0;
        for(int i=0;i<arr.length;i++){
            if(i+2<arr.length && arr[i]%2==1 && arr[i+1]%2==1 && arr[i+2]%2==1){
                f=1;
            }
        }
        if(f==1){
            return true;
        }
        return false;
    }
}
