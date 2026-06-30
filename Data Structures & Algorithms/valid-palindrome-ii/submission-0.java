class Solution {
    public boolean validPalindrome(String s) {
        int l=0, r=s.length()-1;
        while(l<r)
        {
            if(s.charAt(l)==s.charAt(r))
            {
                l++;
                r--;

            }
            else
            {
                return check(s,l+1,r) || check(s,l,r-1);
            }
        }
        return true;
        
    }
    public boolean check(String s, int i, int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}