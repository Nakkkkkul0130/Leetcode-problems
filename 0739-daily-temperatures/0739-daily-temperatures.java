class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] result = new int[n];
        for(int i=n-1;i>=0;i--){
            //pop all indices with lower or equal temp than current index
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }
            // if stack has still element,then next warmer day?
            if(!st.isEmpty()){
                result[i]=st.peek()-i;
            }
            // inserting current index
            st.push(i);

        }
        return result;
    }
}