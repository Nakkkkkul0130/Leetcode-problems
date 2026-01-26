class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int mind = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int diff = Math.abs(arr[i]-arr[i+1]);
            mind = Math.min(mind, diff);
        }
        List<List<Integer>> al = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(Math.abs(arr[i]-arr[i+1]) == mind){
                al.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return al;
    }
}