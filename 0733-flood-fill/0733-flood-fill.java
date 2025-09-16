class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if(original != color){
            helper(image, sr, sc, color, original);
        }
        return image;
    }
    private void helper(int[][] image, int i, int j, int tocolor, int original){
        int n = image.length;
        int m = image[0].length;
        if(i<0 || j<0 || i>=n || j>=m || image[i][j]!=original){
            return;
        }
        image[i][j]=tocolor;
        helper(image, i+1, j, tocolor, original);
        helper(image, i-1, j, tocolor, original);
        helper(image, i, j+1, tocolor, original);
        helper(image, i, j-1, tocolor, original);
    }
}