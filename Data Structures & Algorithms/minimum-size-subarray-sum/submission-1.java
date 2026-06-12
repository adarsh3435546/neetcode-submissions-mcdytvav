class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen=Integer.MAX_VALUE;
        int len=0;
        int sum=0;
        int l=0;
        for(int r=0;r<nums.length;r++)
        {
            sum+=nums[r];

            while(sum>=target)
            {
                sum-=nums[l];
                minlen=Math.min(minlen,r-l+1);
                l++;
            }
           
        }
        return minlen==Integer.MAX_VALUE ? 0: minlen;
    }
}