class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixsum=0;
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);

        for(int i=0;i<nums.length;i++)
        {
           prefixsum=prefixsum+nums[i];
           int rem=prefixsum-k;
           if(map.containsKey(rem))
           {
            count +=map.get(rem);
           }
           map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
           
        }
        return count;
    }
}