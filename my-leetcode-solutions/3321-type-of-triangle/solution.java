class Solution {
    public String triangleType(int[] nums) {
    int a=nums[0];
    int b=nums[1];
    int c=nums[2];
    
   
     if(nums[0]==nums[1] && nums[1]==nums[2] && ((a+b)>c && (a+c)>b && (c+b)>a)){
        return "equilateral";
     }   
     if(nums[0]!=nums[1] && nums[1]!=nums[2] && nums[0]!=nums[2] && ((a+b)>c && (a+c)>b && (c+b)>a)){
        return "scalene";
     }
    
     if((nums[0]==nums[1] || nums[1]==nums[2] || nums[0]==nums[2]) && ((a+b)>c && (a+c)>b && (c+b)>a)){
        return "isosceles";
     }  
    
    return "none";
    }
}
