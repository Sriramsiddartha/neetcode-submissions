class Solution {
    public int[] twoSum(int[] arr, int x) {
        int i=0, j=arr.length-1;
        int res[]=new int[2];
        while(i<j)
        {
            int sum=arr[i]+arr[j];
            if(sum>x)
            {
                j--;
            }
            else if(sum<x)
            {
                i++;
            }
            else
            {
                res[0]=i+1;
                res[1]=j+1;
                break;

            }
        }
        return res;
        
    }
}
