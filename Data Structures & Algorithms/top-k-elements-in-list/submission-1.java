class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> bucket[]=new List[nums.length+1];
        HashMap<Integer,Integer>map=new HashMap<>();
        int result[]=new int [k];

        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);

        }

        for(int n:map.keySet())
        {
            int frequency=map.get(n);

            if(bucket[frequency]==null)
            {
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(n);
        }
        int count=0;

        for(int i=bucket.length-1;i>=0;i--)
        {
            if(bucket[i]!=null&&count<k)
            {
            for(int n:bucket[i])
            {
               result[count++]=n;
            }
               
            }
        }
        return result;


    }
}