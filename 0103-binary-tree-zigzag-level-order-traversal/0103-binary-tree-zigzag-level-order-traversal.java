class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result; 
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
        while (!q.isEmpty()) {
            int n = q.size();
            LinkedList<Integer> level = new LinkedList<>(); 
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.remove();   
                if (leftToRight) {
                    level.addLast(curr.val); 
                } else {
                    level.addFirst(curr.val);
                }
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            result.add(level); 
            leftToRight = !leftToRight; 
        }
        return result;
    }
}
