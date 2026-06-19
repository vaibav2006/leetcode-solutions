class Solution {
    public int largestAltitude(int[] gain) {
      
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        arr[0]=gain[0];
        int sum=gain[0];
        for(int i=1;i<gain.length;i++){
            sum+=gain[i];
            arr[i]=sum;

        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
                min=arr[i];
            }
        }
        return min;
    }
}
