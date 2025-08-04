class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) {
        int color = image[sr][sc];
        if(color!=newcolor){
            helper(image,sr,sc,newcolor,color);
        }
        return image;
    }
    public void helper(int[][] image, int i, int j, int newcolor, int color){
        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j]!=color)   {
            return;
        }
        image[i][j] = newcolor;
        helper(image, i+1, j, newcolor,color);
        helper(image, i-1, j,newcolor,color);
        helper(image, i, j+1,newcolor, color);
        helper(image, i, j-1, newcolor,color);
    }
}