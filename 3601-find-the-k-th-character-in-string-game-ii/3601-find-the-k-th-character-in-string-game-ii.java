class Solution {
    public char kthCharacter(long k, int[] operations) {
        long[] lengths = new long[operations.length + 1];
        lengths[0] = 1;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i] == 0) {
                lengths[i + 1] = Math.min(lengths[i] * 2, k);
            } else {
                lengths[i + 1] = Math.min(lengths[i] * 2, k);
            }
        }

        long pos = k;
        char ch = 'a';

        for (int i = operations.length - 1; i >= 0; i--) {
            long half = lengths[i];

            if (pos > half) {
                pos -= half;
                if (operations[i] == 1) {
                    ch = (char)((ch == 'z') ? 'a' : (ch + 1));
                }
            }
            
        }

        return ch;
    }
}
