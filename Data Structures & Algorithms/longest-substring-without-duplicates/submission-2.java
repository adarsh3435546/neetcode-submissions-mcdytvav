class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int maxlen=0;
        int l=0;
        int r=0;
        while(r<s.length())
        {
            if(map.containsKey(s.charAt(r))&&map.get(s.charAt(r))>=l)
            {
                l=map.get(s.charAt(r))+1;
            }
            int length=r-l+1;
            maxlen=Math.max(length,maxlen);
            map.put(s.charAt(r),r);
            r++;
        }
        return maxlen;
    }
}