class Solution {
    public boolean searchMatrix(int[][] matrix, int t) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0, h=m*n-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            int val=matrix[mid/n][mid%n];
            if(val==t)
            {
                return true;
            }
            else if(val>t)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return false;

        
    }
}
