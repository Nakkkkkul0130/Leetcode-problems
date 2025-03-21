class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long totalchalk = 0;
        for(int chalks : chalk){
            totalchalk+=chalks;
        }
        int remaining = (int)(k % totalchalk);
        for(int i=0;i<chalk.length;i++){
            if(chalk[i]>remaining){
                return i;
            }
            remaining-=chalk[i];

        }
        return -1;
        
    }
}