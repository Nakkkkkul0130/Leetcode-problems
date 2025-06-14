class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0;i<n;i++){
            //removing out of bound index from front

            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            //remove all smaller element from back

            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.pollLast();
            }
            //adding current index
            dq.offerLast(i);

            //Adding max to result once the first window processed
            if(i>=k-1){
                res[i-k+1]=nums[dq.peekFirst()];
            }

        }
        return res;
    }
}