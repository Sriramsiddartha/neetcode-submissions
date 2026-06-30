class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> hm1=new HashMap<>();
        int l=0, min=Integer.MAX_VALUE;
        for(char i: t.toCharArray())
        {
            hm1.put(i, hm1.getOrDefault(i,0)+1);
        } 
        int start=0;
        int havecount=0;
        HashMap<Character, Integer> hm2=new HashMap<>();
        for(int r=0;r<s.length();r++)
        {
            char curr=s.charAt(r);
            hm2.put(curr, hm2.getOrDefault(curr,0)+1);
            if(hm1.containsKey(curr) && hm1.get(curr)==hm2.get(curr))
            {
                havecount++;
            }
            while(havecount==hm1.size())
            {
                if((r-l+1)<min)
                {
                    min=r-l+1;
                    start=l;
                }
                char left=s.charAt(l);
                hm2.put(left, hm2.get(left)-1);
                if(hm1.containsKey(left) && hm2.get(left)<hm1.get(left))
                {
                    havecount--;
                }
                l++;

            }


            

        }
        if(min==Integer.MAX_VALUE)
        {
            return "";
        }
        return s.substring(start,start+min);
        
    }
}
