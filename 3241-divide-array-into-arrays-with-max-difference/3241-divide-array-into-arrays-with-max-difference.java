public class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<int[]> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 3) {
            int x = nums[i];
            int y = nums[i + 1];
            int z = nums[i + 2];
            if (z - x > k) {
                return new int[0][0]; 
            }
            al.add(new int[]{x, y, z});
        }
        return al.toArray(new int[0][]);
    }
}
