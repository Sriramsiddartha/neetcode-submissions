class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb=new StringBuilder();
        for(int k=0;k<s.length();k++)
        {
            if(Character.isLetterOrDigit(s.charAt(k)))
            {
                char lc=Character.toLowerCase(s.charAt(k));
                sb.append(lc);
            } 
        }
        String x=sb.toString();
        int i=0, j=x.length()-1;
        while(i<j)
        {
            if(x.charAt(i)==x.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
        
    }
}
