class Solution {
    public String sortVowels(String s) {
        List<Character> ans = new ArrayList<>();
        for(char c : s.toCharArray()){
            if("AEIOUaeiou".indexOf(c)!=-1){
                ans.add(c);
            }
        }
        Collections.sort(ans);
        StringBuilder sb = new StringBuilder();
        int index=0;
        for(char c : s.toCharArray()){
            if("AEIOUaeiou".indexOf(c)!=-1){
                sb.append(ans.get(index++));
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}