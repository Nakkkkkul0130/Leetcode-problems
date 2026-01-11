class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0){
            return 0;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int[] height = new int[m];
        int maxarea=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    height[j]+=1;
                }
                else{
                    height[j]=0;
                }
            }
            maxarea = Math.max(maxarea, solve(height));
        }
        return maxarea;
    }
    private int solve(int[] height){
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int maxarea = 0;
        for(int i=0;i<=n;i++){
            int curr = (i==n)?0:height[i];
            while(!st.isEmpty() && curr < height[st.peek()]){
                int h = height[st.pop()];
                int l = (st.isEmpty())?-1:st.peek();
                int w = i-l-1;
                maxarea = Math.max(maxarea, h*w);
            }
            st.push(i);
        }
        return maxarea;
    }
}