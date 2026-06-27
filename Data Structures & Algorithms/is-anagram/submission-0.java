class Solution {
    public boolean isAnagram(String s, String t) {
        char arr1[]=new char[s.length()];
        char arr2[]=new char[t.length()];
        if(s.length()!=t.length())
        {
            return false;
        }
        int i=0;
        for(char ch: s.toCharArray())
        {
            arr1[i]=ch;
            i++;
        }
        for(int j=0;j<t.length();j++)
        {
            arr2[j]=t.charAt(j);

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int j=0;j<s.length();j++)
        {
            if(arr1[j]!=arr2[j])
            {
                return false;

            }
        }
        return true;

    }
}
