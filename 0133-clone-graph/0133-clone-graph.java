/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    private Node cloneUtil(Node node, HashMap<Node,Node> mp){
        Node newnode = new Node(node.val);
        mp.put(node, newnode);
        for(Node neighbour : node.neighbors){
            if(!mp.containsKey(neighbour)){
                newnode.neighbors.add(cloneUtil(neighbour, mp));
            }
            else{
                newnode.neighbors.add(mp.get(neighbour));
            }
        }
        return newnode;
    }
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        HashMap<Node, Node> mp = new HashMap<>();
        return cloneUtil(node, mp);

    }
}