class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>>hm=new HashMap<>();
        
        for(String s: strs)
        {
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String curr=new String(ch);
            if(!hm.containsKey(curr))
            {
                hm.put(curr, new ArrayList<>());
            }
            hm.get(curr).add(s);
        }
        return new ArrayList<>(hm.values());
        
    }
}
