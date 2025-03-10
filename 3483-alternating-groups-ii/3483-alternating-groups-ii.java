class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;
        int l = 0;  
        for (int r = 1; r < n + k - 1; r++) {
            int prevIndex = (r - 1) % n;
            int currIndex = r % n;

            if (colors[prevIndex] == colors[currIndex]) {
                l = r;  
            }

            if (r - l + 1 >= k) {
                count++;
            }
        }

        return count;
    }
}
