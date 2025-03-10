class Solution {
    HashSet<Character > set = new HashSet<>();
    public long countOfSubstrings(String s, int k) {
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        long a = get(s,k);
        long b =get(s, k + 1);
        return a - b;
    }
    public long get(String s, int k){
        int i = 0;
        int j = 0;
        long ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int c =0;
        while(i < s.length()){
            char right =s.charAt(i);
            if(set.contains(right))map.put(right, map.getOrDefault(right, 0) + 1);
            else c++;
            while(map.size() == 5 && c >= k){
                ans += (long)(s.length() - i);

                char left = s.charAt(j);
                if(set.contains(left)){
                    if(map.get(left) == 1) map.remove(left);
                    else map.put(left, map.get(left) - 1);
                }else c--;

                j++;
            }
            i++;
        }
        return ans;
    }
}