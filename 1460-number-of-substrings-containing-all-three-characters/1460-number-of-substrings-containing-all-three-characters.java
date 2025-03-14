class Solution {
    public int numberOfSubstrings(String s) {
        int lastA = -1, lastB = -1, lastC = -1; 
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') lastA = i;
            if (s.charAt(i) == 'b') lastB = i;
            if (s.charAt(i) == 'c') lastC = i;
            
            int minIndex = Math.min(lastA, Math.min(lastB, lastC));
            if (minIndex != -1) { 
                result += minIndex + 1; 
            }
        }
        
        return result;
    }
}
