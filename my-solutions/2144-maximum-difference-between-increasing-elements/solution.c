int maximumDifference(int* nums, int numsSize) {
    int max=0;
    int min=nums[0];
    for(int i=0;i<numsSize;i++){
        if(nums[i]<min){
            min=nums[i];
        }
        if(nums[i]-min>max){
            max=nums[i]-min;
        }
    }
    if(max>0){
        return max;
    }
    return -1;
}
