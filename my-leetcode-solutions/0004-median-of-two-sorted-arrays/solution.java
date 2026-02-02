class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int[] mergedArray = new int[nums1.length + nums2.length];
          System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
          System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
          Arrays.sort(mergedArray);
          int len=mergedArray.length;
          if(mergedArray.length%2==0){
                int a=len/2;
                int b=a+1;
                double c=mergedArray[a-1]+mergedArray[b-1];
                double d=c/2;
                return d;
          }
          else{
            int a=len-1;
            int b=a/2;
            return mergedArray[b];
          }
         
    }
}
