class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> hs = new HashSet<>();
        int n = digits.length;
        for(int i=0;i<n;i++){
            if(digits[i]==0){
                continue;
            }
            for(int j=0;j<n;j++){
                if(j==i){
                    continue;
                }
                for(int k=0;k<n;k++){
                    if(j==k || i==k){
                        continue;
                    }
                    int num = digits[i]*100 + digits[j]*10 + digits[k];
                    if(num%2==0){
                        hs.add(num);
                    }
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>(hs);
        Collections.sort(al);
        int[] result = new int[al.size()];
        for(int i=0;i<al.size();i++){
            result[i]=al.get(i);
        }
        return result;
    }
}