class Solution {

    ArrayList<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int t) {

        List<Integer> ans = new ArrayList<>();
        sol(nums, 0, 0, t, ans);

        return res;
    }

    public void sol(int nums[], int i, int sum, int t, List<Integer> ans) {

        if (sum == t) {
            res.add(new ArrayList<>(ans));
            return;
        }

        if (i == nums.length || sum > t) {
            return;
        }

        // Choose
        sum += nums[i];
        ans.add(nums[i]);

        sol(nums, i, sum, t, ans);

        // Backtrack
        sum -= nums[i];
        ans.remove(ans.size() - 1);

        // Skip
        sol(nums, i + 1, sum, t, ans);
    }
}