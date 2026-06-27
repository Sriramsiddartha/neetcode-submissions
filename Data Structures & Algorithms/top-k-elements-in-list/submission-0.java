class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Map.Entry<Integer, Integer>> res=new ArrayList<>(hm.entrySet());
        res.sort((a,b)->b.getValue()-a.getValue());
        int ans[]=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=res.get(i).getKey();
        }
        return ans;


        
    }
}
