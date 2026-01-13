class Solution {
    public double separateSquares(int[][] squares) {
        double low = Double.MAX_VALUE;
        double high = Double.MIN_VALUE;
        double totalArea = 0.0;

        for(int[] square : squares) {
            double y = square[1];
            double l = square[2];

            totalArea += l * l;
            low = Math.min(low, y);
            high = Math.max(high, (y + l));
        }

        double res = 0.0;
        double limit = 1e-5;

        while(high - low > limit) {

            double midY = low + (high - low)/2.0;
            res = midY;

            if(checkDividedArea(squares, midY, totalArea)) {
                high = midY;
            }else {
                low = midY;
            }
        }
        return res;
    }

    public boolean checkDividedArea(int[][] squares, double mid, double totalArea) {
        double bottomArea = 0.0;

        for(int[] square : squares) {
            // 3 scenarios possible
            double y = square[1];
            double l = square[2];

            if(mid >= y + l) {
                bottomArea += (l * l);
            } else if(mid > y ) {
                bottomArea += (mid - y) * l;
            }
        }

        return bottomArea >= totalArea / 2.0;
    }
}