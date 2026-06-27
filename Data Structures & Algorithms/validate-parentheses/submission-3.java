class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch: s.toCharArray())
        {
            if(ch=='{' || ch=='['||ch=='(')
            {
                st.push(ch);
            }

           
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                if(!st.isEmpty())
                {
                    char top=st.peek();
                
                
                    if(ch==')' && top=='(' || ch==']' && top=='['||ch=='}' && top=='{')
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    }
                    
                    
                }
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        
        return false;
        
    }
}
