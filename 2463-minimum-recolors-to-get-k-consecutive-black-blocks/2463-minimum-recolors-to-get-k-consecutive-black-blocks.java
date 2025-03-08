class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int min = Integer.MAX_VALUE;
        int cnt=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                cnt++;
            }
            min=cnt;

        }
        for (int i = k; i < n; i++) {
            if (blocks.charAt(i - k) == 'W') {
                cnt--;
            }
            if (blocks.charAt(i) == 'W') {
                cnt++;
            }
            min = Math.min(min, cnt);
        }
        return min;
        

    }
}