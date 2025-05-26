class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        char[] diff1 = new char[2];
        char[] diff2 = new char[2];
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (count >= 2) return false;  
                diff1[count] = s1.charAt(i);
                diff2[count] = s2.charAt(i);
                count++;
            }
        }

        return count == 2 && diff1[0] == diff2[1] && diff1[1] == diff2[0];
    }
}
