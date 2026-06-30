class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int N=arr.length;
        int res[]=new int[N];
        for(int i=N-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[i]>=arr[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                res[i]=0;

            }
            else
            {
                res[i]=st.peek()-i;
            }
            st.push(i);
        }
        return res;
        
    }
}
