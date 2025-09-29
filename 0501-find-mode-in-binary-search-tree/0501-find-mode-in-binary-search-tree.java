class Solution {
    public int[] findMode(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inorder(root, values);

        Map<Integer, Integer> freq = new HashMap<>();
        int maxCount = 0;
        for (int val : values) {
            int count = freq.getOrDefault(val, 0) + 1;
            freq.put(val, count);
            maxCount = Math.max(maxCount, count);
        }

        List<Integer> modes = new ArrayList<>();
        for (int val : freq.keySet()) {
            if (freq.get(val) == maxCount) {
                modes.add(val);
            }
        }

        int[] res = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            res[i] = modes.get(i);
        }
        return res;
    }

    private void inorder(TreeNode node, List<Integer> values) {
        if (node == null) return;
        inorder(node.left, values);
        values.add(node.val);
        inorder(node.right, values);
    }
}