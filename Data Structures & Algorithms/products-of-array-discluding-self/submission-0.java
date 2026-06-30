class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];
        int N=nums.length;
        res[0]=1;
        for(int i=1;i<N;i++)
        {
            res[i]=nums[i-1]*res[i-1];
        }
        int r=1;
        for(int i=N-1;i>=0;i--)
        {
            res[i]*=r;
            r*=nums[i];
        }
        return res;
        
    }
}  
