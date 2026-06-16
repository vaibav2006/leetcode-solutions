class Solution {
    public int[] shuffle(int[] nums, int n) {
       // List<Integer> l1=new ArrayList<>();
        //List<Integer> l2=new ArrayList<>();
        int[] a1=new int[n];
        int[] a2=new int[n];
        for(int i=0;i<n;i++){
            a1[i]=nums[i];
        }
        for(int i=n;i<nums.length;i++){
            a2[i-n]=nums[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(a1[i]);
            System.out.println(a2[i]);
        }
        
        int[] res= new int[nums.length];
        int c=0;
        for(int i=0;i<n;i++)
        {
            
            res[c++]=a1[i];
            res[c++]=a2[i];
        }
        return res;
    }
}
