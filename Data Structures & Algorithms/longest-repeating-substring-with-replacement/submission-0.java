class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int max=0, maxf=0;
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int r=0;r<s.length();r++)
        {
            char curr=s.charAt(r);
            hm.put(curr,hm.getOrDefault(curr,0)+1);
            maxf=Math.max(maxf, hm.get(curr));
            while((r-l+1)-maxf>k)
            {
                char left=s.charAt(l);
                hm.put(left, hm.get(left)-1);
                l++;
            }
            max=Math.max(max, r-l+1);
        }
        return max;
        
    }
}
