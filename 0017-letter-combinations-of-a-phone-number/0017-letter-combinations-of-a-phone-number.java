class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();

        HashMap<Character, String> hs = new HashMap<>();
        hs.put('2', "abc");
        hs.put('3', "def");
        hs.put('4', "ghi");
        hs.put('5', "jkl");
        hs.put('6', "mno");
        hs.put('7', "pqrs");
        hs.put('8', "tuv");
        hs.put('9', "wxyz");

        ArrayList<String> result = new ArrayList<>();
        result.add("");

        for(char c : digits.toCharArray()){
            String chars = hs.get(c);
            ArrayList<String> temp = new ArrayList<>();
            for(String combination : result){
                for(char letter : chars.toCharArray()){
                    temp.add(combination+letter);
                }
            }
            result = temp;
        }

    return result;
    }
}