class Solution {
    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks);
        long low = 1;  
        long high = (long) ranks[ranks.length - 1] * (long) cars * (long) cars;  

        while (low < high) {
            long mid = low + (high - low) / 2;
            long totalCars = 0;

            for (int rank : ranks) {
                totalCars += (long) Math.sqrt((double) mid / rank);  
                if (totalCars >= cars) break;  
            }

            if (totalCars >= cars) high = mid;  
            else low = mid + 1;  
        }
        return low;  
    }
}
