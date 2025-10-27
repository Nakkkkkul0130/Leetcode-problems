class Solution {
    public int totalFruit(int[] fruits) {
        int lastFruit = -1, secondLastFruit = -1;
        int lastCount = 0, currentMax = 0, maxLen = 0;

        for (int fruit : fruits) {
            if (fruit == lastFruit || fruit == secondLastFruit) {
                currentMax++;
            } else {
                currentMax = lastCount + 1;
            }

            if (fruit == lastFruit) {
                lastCount++;
            } else {
                lastCount = 1;
            }

            if (fruit != lastFruit) {
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }

            maxLen = Math.max(maxLen, currentMax);
        }
        return maxLen;
    }
}
