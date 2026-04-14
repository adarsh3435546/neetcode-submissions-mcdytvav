class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String ans="";
       String str1=strs[0];
       String str2=strs[strs.length-1]; 
       for(int i=0;i<str1.length();i++)
       {
          if(str1.charAt(i)==str2.charAt(i))
          {
            ans+=str1.charAt(i);
          }
          else
          {
            return ans;
          }
       }
       return ans;
    }
}