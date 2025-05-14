class Solution {
    public long smallestNumber(long num) {
        if (num == 0) return 0;

        boolean isNegative = num < 0;
        String str = Long.toString(Math.abs(num));
        String[] digits = str.split("");  

        
        Arrays.sort(digits, (a, b) -> {
            if (isNegative) {
                // For negative, sort descending
                return (b + a).compareTo(a + b);
            } else {
                // For positive, sort ascending
                return (a + b).compareTo(b + a);
            }
        });

        if (!isNegative && digits[0].equals("0")) {
            for (int i = 1; i < digits.length; i++) {
                if (!digits[i].equals("0")) {
                    
                    String temp = digits[0];
                    digits[0] = digits[i];
                    digits[i] = temp;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String d : digits) {
            sb.append(d);
        }

        long result = Long.parseLong(sb.toString());
        return isNegative ? -result : result;
    }
}
