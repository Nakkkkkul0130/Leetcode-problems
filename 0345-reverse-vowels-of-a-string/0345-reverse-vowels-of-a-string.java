class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = s.length()-1;
        String vowels = "aeiouAEIOU";
        while(l<r){
            while(l<r && vowels.indexOf(s.charAt(l))==-1){
                l++;
            }
            while(l<r && vowels.indexOf(s.charAt(r))==-1){
                r--;
            }
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}