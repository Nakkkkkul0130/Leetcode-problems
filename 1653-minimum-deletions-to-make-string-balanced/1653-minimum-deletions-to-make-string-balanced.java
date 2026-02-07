class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int ans = 0;
        int no_of_b = 0;
        for(char c : s.toCharArray()){
            if(c=='b'){
                no_of_b += 1;
            }
            else if(c=='a' && no_of_b > 0){
                ans++;
                no_of_b--;
            }
        }
        return ans;
    }
}