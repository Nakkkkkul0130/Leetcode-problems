class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     res[i] = -1;
        //     for(int j=1;j<nums.length;j++){
        //         int index = (i+j)%nums.length;
        //         if(nums[index]>nums[i]){
        //             res[i] = nums[index];
        //             break;
        //         }
        //     }
        // }
        // return res;
        Arrays.fill(res,-1);
        Stack<Integer> st = new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i%n]){
                st.pop();
            }
            res[i%n] = st.isEmpty()?-1 : nums[st.peek()];
            st.push(i%n);
        }
        return res;
    }
}