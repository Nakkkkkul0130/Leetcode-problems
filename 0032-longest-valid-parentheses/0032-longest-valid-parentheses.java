class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int max = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else {
                st.pop(); // pop the matching '(' or the last invalid index
                if(st.isEmpty()){
                    st.push(i); // push current index as new base for next valid substring
                }
            }
            max = Math.max(max, i-st.peek());
        }
        return max;
    }
}