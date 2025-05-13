class Solution {
    public int lengthAfterTransformations(String s, int t) {
        final int MOD = 1_000_000_007;

        // Creating an array to store how many times each character appears
        // freq[0] -> 'a', freq[1] -> 'b', ..., freq[25] -> 'z'
        long[] freq = new long[26];

        // Count the frequency of each character in the input string
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Perform 't' transformations
        for (int i = 0; i < t; i++) {
            // Creating a new array to store updated frequencies after this transformation
            long[] newFreq = new long[26];

            for (int j = 0; j < 26; j++) {
                if (j == 25) {
                    // If the character is 'z', it becomes "ab"
                    newFreq[0] = (newFreq[0] + freq[25]) % MOD; // add to 'a'
                    newFreq[1] = (newFreq[1] + freq[25]) % MOD; // add to 'b'
                } else {
                    // Other characters just shift to the next character
                    newFreq[j + 1] = (newFreq[j + 1] + freq[j]) % MOD;
                }
            }

            // Update the frequency array for the next transformation
            freq = newFreq;
        }

        long totalLength = 0;
        for (int i = 0; i < 26; i++) {
            totalLength = (totalLength + freq[i]) % MOD;
        }

        return (int) totalLength;
    }
}
