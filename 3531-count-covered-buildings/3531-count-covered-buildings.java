class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        HashMap<Integer, Integer> rowMin = new HashMap<>();
        HashMap<Integer, Integer> rowMax = new HashMap<>();
        HashMap<Integer, Integer> colMin = new HashMap<>();
        HashMap<Integer, Integer> colMax = new HashMap<>();

        for (int[] b : buildings) {
            int r = b[0];
            int c = b[1];

            rowMin.put(r, Math.min(rowMin.getOrDefault(r, Integer.MAX_VALUE), c));
            rowMax.put(r, Math.max(rowMax.getOrDefault(r, Integer.MIN_VALUE), c));

            colMin.put(c, Math.min(colMin.getOrDefault(c, Integer.MAX_VALUE), r));
            colMax.put(c, Math.max(colMax.getOrDefault(c, Integer.MIN_VALUE), r));
        }

        int count = 0;
        for (int[] b : buildings) {
            int r = b[0];
            int c = b[1];

            boolean leftExists  = rowMin.containsKey(r) && rowMin.get(r) < c;
            boolean rightExists = rowMax.containsKey(r) && rowMax.get(r) > c;
            boolean upExists    = colMin.containsKey(c) && colMin.get(c) < r;
            boolean downExists  = colMax.containsKey(c) && colMax.get(c) > r;

            if (leftExists && rightExists && upExists && downExists) count++;
        }

        return count;
    }
    
}
