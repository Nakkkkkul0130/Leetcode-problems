class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        for(char c : s.toCharArray()){
            hs.put(c, hs.getOrDefault(c,0)+1);
        }
        Set<Character> vis = new HashSet<>();
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            hs.put(c, hs.get(c)-1);
            if(vis.contains(c)) continue;

            while(!st.isEmpty() && c<st.peek() && hs.get(st.peek())>0){
                vis.remove(st.pop());
            }
            st.push(c);
            vis.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        return sb.toString();
    }
}