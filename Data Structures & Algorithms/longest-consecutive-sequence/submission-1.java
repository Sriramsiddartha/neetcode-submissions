class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i: arr)
        {
            hs.add(i);
        }
        int max=0;
        for(int i : hs)
        {
            if(!hs.contains(i-1))
            {
                int ans=0;
                int curr=i;
                while(hs.contains(curr))
                {
                    ans++;
                    max=Math.max(max, ans);
                    curr++;

                }
            }
        }
        return max;


        
    }
}
