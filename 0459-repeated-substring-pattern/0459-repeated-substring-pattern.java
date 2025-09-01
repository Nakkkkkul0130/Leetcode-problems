class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i=1;i<n;i++){
            String sub = s.substring(0,i);
            StringBuilder sb = new StringBuilder();

            while(sb.length()<n){
                sb.append(sub);
            }
            if(sb.toString().equals(s)){
                return true;
            }
        }
        return false;
    }
}