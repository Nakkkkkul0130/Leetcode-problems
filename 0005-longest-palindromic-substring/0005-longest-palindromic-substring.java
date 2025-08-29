class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub = s.substring(i, j+1);
                if(ispalindrome(sub) && sub.length()>res.length()){
                    res=sub;
                }
            }
            
        }
        return res;
    }
    private boolean ispalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}