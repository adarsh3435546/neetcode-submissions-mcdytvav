class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first =strs[0];
        String last=strs[strs.length-1];

        int length=0;

        for(int i=0;i<first.length();i++)
        {
            if(first.charAt(i)!=last.charAt(i))
            {
                return first.substring(0,length);
            }
            length++;
        }
       return first.substring(0,length);
    }
}