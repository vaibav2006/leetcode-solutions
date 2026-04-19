class Solution {
    public int subtractProductAndSum(int n) {
        String strNum = Integer.toString(n);
        int[] arr=new int[strNum.length()];
        for (int i = 0; i < strNum.length(); i++) {
            int digit = Character.getNumericValue(strNum.charAt(i));
            arr[i]=digit;
        }
        int prod=1,sum=0;
        for(int i=0;i<arr.length;i++){
            prod*=arr[i];
            sum+=arr[i];
        }
        return prod-sum;
    }
}
