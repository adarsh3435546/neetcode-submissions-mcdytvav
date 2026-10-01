class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int leftprefix[]=new int[len];
        int rightprefix[]=new int[len];

        leftprefix[0]=nums[0];
        rightprefix[len-1]=nums[len-1];

        for(int i=1;i<nums.length;i++)
        {
            leftprefix[i]=leftprefix[i-1]*nums[i];
        }

        for(int i=len-2;i>=0;i--)
        {
            rightprefix[i]=rightprefix[i+1]*nums[i];
        }
        int output[]=new int[len];
        output[0]=rightprefix[1];
        output[len-1]=leftprefix[len-2];

        for(int i=1;i<nums.length-1;i++)
        {
           output[i]=leftprefix[i-1]*rightprefix[i+1];
        }
        return output;
    }
}  
