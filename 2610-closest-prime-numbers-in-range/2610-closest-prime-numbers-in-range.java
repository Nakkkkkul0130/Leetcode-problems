class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] isprime = new boolean[right+1];
        Arrays.fill(isprime, true);
        isprime[0] = isprime[1] = false;
        for(int i=2;i*i<=right;i++){
            if(isprime[i]){
                for(int j=i*i;j<=right;j+=i){
                    isprime[j]=false;
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isprime[i]){
                al.add(i);
            }
        }
        if(al.size()<2){
            return new int[]{-1,-1};
        }
        Iterator<Integer> itr = al.iterator();
        int prevprime=itr.next();
        int[] result = new int[2];
        int mingap = Integer.MAX_VALUE;
        while(itr.hasNext()){
            int currprime = itr.next();
            int gap=currprime-prevprime;
            if(gap<mingap){
                mingap=gap;
                result[0]=prevprime;
                result[1]=currprime;
            }
            prevprime=currprime;


        }   
        return result;
       
    }
    
}