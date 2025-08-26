class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        result.add(current);
        for(int[] interval : intervals){
            int currend = current[1];
            int nextbegin = interval[0];
            int nextend = interval[1];
            if(currend>=nextbegin){
                current[1] = Math.max(currend,nextend);
            }
            else{
                current = interval;
                result.add(current);
            }

        }
        return result.toArray(new int[result.size()][]);
    }
}