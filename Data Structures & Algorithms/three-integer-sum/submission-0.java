class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        
        
        Arrays.sort(nums);
        for(int k=0;k<nums.length-2;k++)
        {
            if(k>0 && nums[k]==nums[k-1])
            {
                continue;
            }
            int i=k+1;
            int j=nums.length-1;
            while(i<j)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0)
                {
                    j--;
                }
                else if(sum<0)
                {
                    i++;
                }
                else
                {
                    ArrayList<Integer> res=new ArrayList<>();
                    res.add(nums[k]);
                    res.add(nums[i]);
                    res.add(nums[j]);
                    i++;
                    j--;
                    list.add(res);
                    while(i<j && nums[i]==nums[i-1])
                    {
                        i++;
                    }
                    while(i<j && nums[j]==nums[j+1])
                    {
                        j--;
                    }
                    
                }

            }
          
        }
        return list;
    }
}
