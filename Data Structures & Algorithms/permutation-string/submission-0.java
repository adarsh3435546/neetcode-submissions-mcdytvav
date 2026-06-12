class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[]arr=s1.toCharArray();
        Arrays.sort(arr);
        String ans1=new String(arr);

        for(int i=0;i<=s2.length()-s1.length();i++)
        {
             String curr="";
            for(int j=i;j<i+s1.length();j++)
            {
                curr+=s2.charAt(j);
            }
           char[]arr2=curr.toCharArray();
           Arrays.sort(arr2);
           String ans2=new String(arr2);
           if(ans2.equals(ans1))
           {
            return true;
           }

        }
        return false ;
    }
}
