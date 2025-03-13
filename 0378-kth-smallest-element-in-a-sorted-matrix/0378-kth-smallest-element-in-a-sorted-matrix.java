class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length, cols = matrix[0].length;
        int[] temp = new int[rows * cols];

        int j = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                temp[j++] = num;
            }
        }
        Arrays.sort(temp);
        int count=0;
        int f=-1;
        for(int i=0;i<temp.length;i++){
            count++;
            if(count==k){
                f=temp[i];
            }
        }
        return f;
        
        
    }
}