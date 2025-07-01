class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        int size = n;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)!=word.charAt(i-1)){
                size--;
            }
        }
        return size;
    }
}