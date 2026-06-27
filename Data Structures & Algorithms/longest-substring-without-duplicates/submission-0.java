class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int l=0,max=0;
        for(int r=0;r<s.length();r++)
        {
            char curr=s.charAt(r);
            while(hs.contains(curr))
            {
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(curr);
            int len=r-l+1;
            max=Math.max(max, len);
        }
        return max;
        
    }
}
