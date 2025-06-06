class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        int h=0;
        for(int i=0;i<n;i++){
            int count=n-i;
            if(citations[i]>=count){
                h=count;
                break;
            }
        }
        return h;
    }
}