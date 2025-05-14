class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i] = String.valueOf(nums[i]);
        }
// Custom sort to arrange numbers in such a way that the concatenation forms the largest number.
// For two strings a and b, we compare "b+a" with "a+b".
// If "b+a" is larger, we want b to come before a to make the overall number bigger.

        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));

        if(str[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for(String s : str){
            sb.append(s);
        }
        return sb.toString();


    }
}