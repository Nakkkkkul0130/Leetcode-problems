class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int n = chars.length;
        for(int i=0;i<n;){
            char curr = chars[i];
            int count=0;
            while(i<n && chars[i]==curr){
                i++;
                count++;
            }
            sb.append(curr);
            if(count>1){
                sb.append(count);
            }
        }
        for(int i=0;i<sb.length();i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}