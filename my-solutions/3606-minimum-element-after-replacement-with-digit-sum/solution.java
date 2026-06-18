class Solution {
    public int minElement(int[] nums) {
        int[] ar=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int s=0;
            int n=nums[i];
            while(n>0){
                int m=n%10;
                s=s+m;
                
                n=n/10;
            }
            ar[i]=s;
        }
        int min=ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i]<min){
                min=ar[i];

            }
        }
        return min;
    }
}
