class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int result=0;
        while(i<j)
        {
            int min=Math.min(height[i],height[j]);
            
            int water=min*(j-i);
            if(water>result)
            {
                result=water;
            }

            if(height[i]>=height[j])
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return result;
    }
}