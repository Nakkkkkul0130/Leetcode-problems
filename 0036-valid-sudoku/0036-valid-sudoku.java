class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;

        // Arrays to track values seen in each row, column, and 3x3 box
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];

        // Initialize all sets for rows, columns, and boxes
        for (int i = 0; i < n; i++) {
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                char cell = board[r][c];
                if (cell == '.') {
                    continue;
                }

                // Checking for duplicates in the current row
                if (rows[r].contains(cell)) {
                    return false;
                }
                rows[r].add(cell);

                // Checking for duplicates in the current column
                if (cols[c].contains(cell)) {
                    return false;
                }
                cols[c].add(cell);

                // Calculating index of 3x3 box (0 to 8)
                int boxindex = 3 * (r / 3) + (c / 3);

                // Checking for duplicates in the current 3x3 box
                if (boxes[boxindex].contains(cell)) {
                    return false;
                }
                boxes[boxindex].add(cell);
            }
        }
        return true;
    }
}
