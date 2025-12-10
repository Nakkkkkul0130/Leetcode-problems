class Solution {
    public int countPermutations(int[] complexity) {
        int firstEle = complexity[0];
        int n = complexity.length, MOD = 1000000007;
        long Permutation = 1;

        for (int i = 1; i < n; i++) {
            if (firstEle >= complexity[i])
                return 0;

            Permutation = (Permutation * i) % MOD;
        }

        return (int) Permutation;
    }
}