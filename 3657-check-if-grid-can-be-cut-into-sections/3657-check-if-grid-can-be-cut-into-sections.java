class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        int nn=rectangles.length;
        Arrays.sort(rectangles,(a,b)->a[0]-b[0]);
        int end=rectangles[0][2];
        int gaps=0;
        for(int i=1;i<nn;i++) {
            if(rectangles[i][0]>=end){
                gaps++;
            }
            end=Math.max(end, rectangles[i][2]);
        }
        if(gaps>1){
            return true;
        } 
        Arrays.sort(rectangles,(a,b)->a[1]-b[1]);
        end=rectangles[0][3];
        gaps=0;
        for(int i=1;i<nn;i++) {
            if(rectangles[i][1]>=end){
                gaps++;
            }
            end=Math.max(end,rectangles[i][3]);
        }
        return gaps>=2;
    }
}