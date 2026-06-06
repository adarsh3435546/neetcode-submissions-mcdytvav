class Solution {
    public int trap(int[] height) {
        int length=height.length;
        int water=0;
        int []premax=new int[length];
        int []sufmax=new int[length];
        premax[0]=height[0];
        sufmax[length-1]=height[length-1];
        for(int i=1;i<height.length;i++)
        {
          premax[i]=Math.max(height[i],premax[i-1]);
        }
        for(int i=height.length-2;i>=0;i--)
        {
            sufmax[i]=Math.max(height[i],sufmax[i+1]);
        }

        for(int i=0;i<height.length;i++)
        {
            if(height[i]<premax[i]&&height[i]<sufmax[i])
            {
                water+=Math.min(premax[i],sufmax[i])-height[i];
            }
        }
        return water;
        
    }
}