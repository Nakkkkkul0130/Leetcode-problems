class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hs = new HashMap<>();        
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            hs.put(nums2[i], st.isEmpty()? -1 : st.peek());
            st.push(nums2[i]);
            
        }
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i] = hs.get(nums1[i]);
        }
        return res;

    }
}