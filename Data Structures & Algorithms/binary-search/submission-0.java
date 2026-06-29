class Solution {
    public int search(int[] nums, int t) {
        int l=0, h=nums.length-1;
        
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]==t)
            {
                return mid;
            }
            else if(nums[mid]<t)
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        return -1;
        
    }
}
