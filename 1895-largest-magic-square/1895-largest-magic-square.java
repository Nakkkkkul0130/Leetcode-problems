class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] rowsum = new int[m][n + 1];
        int[][] colsum = new int[m + 1][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowsum[i][j + 1] = rowsum[i][j] + grid[i][j];
            }
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                colsum[i + 1][j] = colsum[i][j] + grid[i][j];
            }
        }

        int maxSize = Math.min(m, n);

        for (int k = maxSize; k >= 2; k--) {
            for (int i = 0; i <= m - k; i++) {
                for (int j = 0; j <= n - k; j++) {

                    int d1 = 0, d2 = 0;
                    for (int x = 0; x < k; x++) {
                        d1 += grid[i + x][j + x];
                        d2 += grid[i + x][j + k - 1 - x];
                    }

                    if (d1 != d2) continue;

                    boolean isMagic = true;

                    for (int r = i; r < i + k; r++) {
                        int rowSum = rowsum[r][j + k] - rowsum[r][j];
                        if (rowSum != d1) {
                            isMagic = false;
                            break;
                        }
                    }
                    if (!isMagic) continue;

                    for (int c = j; c < j + k; c++) {
                        int colSum = colsum[i + k][c] - colsum[i][c];
                        if (colSum != d1) {
                            isMagic = false;
                            break;
                        }
                    }

                    if (isMagic) return k;
                }
            }
        }

        return 1;
    }
}