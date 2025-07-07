class FindSumPairs {
    private int[] n1, n2;
    private Map<Integer, Integer> map;

    public FindSumPairs(int[] nums1, int[] nums2) {
        n1 = nums1;
        n2 = nums2;
        map = new HashMap<>();
        for (int x : n2) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int oldVal = n2[index];
        map.put(oldVal, map.get(oldVal) - 1);
        if (map.get(oldVal) == 0) {
            map.remove(oldVal); // Clean up zero count
        }

        n2[index] += val;
        int newVal = n2[index];
        map.put(newVal, map.getOrDefault(newVal, 0) + 1);
    }

    public int count(int tot) {
        int count = 0;
        for (int x : n1) {
            count += map.getOrDefault(tot - x, 0);
        }
        return count;
    }
}
