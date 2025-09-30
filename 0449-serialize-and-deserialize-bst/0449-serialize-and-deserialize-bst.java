/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<Integer> ser = new ArrayList<>();
        preorder(root,ser);
        return listToString(ser);
        
    }
    private void preorder(TreeNode root, List<Integer> ser){
        if(root==null){
            return;
        }
        ser.add(root.val);
        preorder(root.left, ser);
        preorder(root.right, ser);
    }
    private String listToString(List<Integer> ser){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ser.size();i++){
            if(i>0) sb.append(",");
            sb.append(ser.get(i));
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null || data.isEmpty()){
            return null;
        }
        String[] values = data.split(",");
        TreeNode root = null;
        for(String v : values){
            root = insert(root, Integer.parseInt(v));
        }
        return root;
        
    }
    private TreeNode insert(TreeNode root, int val){
        if(root==null){
            return new TreeNode(val);
        }
        if(val<root.val){
            root.left= insert(root.left,val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;