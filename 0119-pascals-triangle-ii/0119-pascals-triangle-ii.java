class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.get(0).add(1);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> prev = res.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prev.get(j-1)+prev.get(j));
            }
            row.add(1);
            res.add(row);
        }
        return res.get(rowIndex);
    }
}