class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        Arrays.sort(strs);
        String l = strs[0];
        String r = strs[strs.length-1];

        int i = 0;
        while(i<l.length() && i<r.length() && l.charAt(i)==r.charAt(i)){
            i++;
        }
        return l.substring(0,i);
    }
}