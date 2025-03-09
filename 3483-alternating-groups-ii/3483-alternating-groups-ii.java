class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int[] temp = new int[n + k - 1];
        System.arraycopy(colors, 0, temp, 0, n);
        System.arraycopy(colors, 0, temp, n, k - 1); 

        int cnt = 0;
        int l = 0;
        
        for (int r = 0; r < temp.length; r++) {
            if (r > 0 && temp[r] == temp[r - 1]) {
                l = r;  
            }
            
            if (r- l + 1 >= k) {
                cnt++;  
            }
        }
        
        return cnt;
    }
}