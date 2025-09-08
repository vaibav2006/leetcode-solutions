void sortColors(int* nums, int numsSize) 
{
    int n=numsSize,i,j;
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(nums[i]>nums[j])
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
    }
    for(int i=0;i<n;i++)
    {
        printf("%d",nums[i]);
    }
}
