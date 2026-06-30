class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int res[]=new int[nums2.length];
        HashMap<Integer, Integer> hm=new HashMap<>();
        
        int ans[]=new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && nums2[i]>st.peek())
            {
                st.pop();
                
            }
            if(st.isEmpty())
            {
                res[i]=-1;
            }
            else
            {
                res[i]=st.peek();

            }
            
            st.push(nums2[i]);

        }
        for(int i=0;i<nums2.length;i++)
        {
            hm.put(nums2[i],res[i]);
        }
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=hm.get(nums1[i]);
        }
        return ans;

        
    }
}