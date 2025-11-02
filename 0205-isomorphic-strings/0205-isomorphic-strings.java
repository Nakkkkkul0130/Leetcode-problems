class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> s1 = new HashMap<>();
        HashMap<Character, Character> t1 = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s1.containsKey(s.charAt(i))){
                if(s1.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else{
                s1.put(s.charAt(i), t.charAt(i));
            }
            if(t1.containsKey(t.charAt(i))){
                if(t1.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }
            else{
                t1.put(t.charAt(i), s.charAt(i));
            }

        }
        return true;
    }
}