class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hs = new HashMap<>();
        for(String s : strs){
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String str = new String(array);
            if(!hs.containsKey(str)){
                hs.put(str, new ArrayList<>());
            }
            hs.get(str).add(s);
        }
        return new ArrayList<>(hs.values());
    }
}