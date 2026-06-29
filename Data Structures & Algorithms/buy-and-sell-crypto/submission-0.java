class Solution {
    public int maxProfit(int[] arr) {
        int mp=0, min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int cp=arr[i]-min;
            if(cp>mp)
            {
                mp=cp;
            }
            min=Math.min(min, arr[i]);
        }
        return mp;

        
    }
}
