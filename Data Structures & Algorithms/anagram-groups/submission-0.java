class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
          char ch[]=strs[i].toCharArray();
          Arrays.sort(ch);
          String result=new String(ch);

          if(!map.containsKey(result))
          {
              map.put(result,new ArrayList<>());
          }
          map.get(result).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
