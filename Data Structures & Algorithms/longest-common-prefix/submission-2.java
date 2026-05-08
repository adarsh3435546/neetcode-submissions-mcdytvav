class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String s1=strs[strs.length-1];
       String s2=strs[0];
       String ans="";
       for(int i=0;i<s2.length();i++)
       {
        if(s1.charAt(i)==s2.charAt(i))
        {
          ans+=s1.charAt(i);
        }
        else
        return ans;
       } 
       return ans;
    }
}