class Solution {
    public String largestGoodInteger(String num) {
        String maxStr = ""; 
        
        for (int i = 0; i < num.length() - 2; i++) {
            String sub = num.substring(i, i + 3);
            if (sub.charAt(0) == sub.charAt(1) && sub.charAt(1) == sub.charAt(2)) {
                if (maxStr.equals("") || sub.compareTo(maxStr) > 0) {
                    maxStr = sub;
                }
            }
        }
        
        return maxStr;
    }
}
