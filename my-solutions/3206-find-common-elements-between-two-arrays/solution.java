class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int [] ans=new int[2];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> l=new HashSet<>();
        while(i!=nums1.length && j!=nums2.length){
            if(nums1[i]==nums2[j]){
                l.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                i++; 
            }
            else{
                j++;
            }
        }
        int c1=0,c2=0;
        for(int m=0;m<nums1.length;m++){
            for(Integer x:l){
                if(x==nums1[m]) c1++;
            }
        }
        for(int m=0;m<nums2.length;m++){
            for(Integer x:l){
                if(x==nums2[m]) c2++;
            }
        }
        ans[0]=c1;
        ans[1]=c2;
        return ans;
    }
}
