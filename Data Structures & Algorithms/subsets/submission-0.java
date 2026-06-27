class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        sol(nums, 0,ans);
        
        return res;
    }
    public  void sol(int nums[], int i, List<Integer> ans)
    {
        if(i==nums.length)
        {
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        sol(nums,i+1, ans);
        ans.remove(ans.size()-1);
        sol(nums,i+1,ans);
    }

}
