class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;

        int buy1 = Integer.MIN_VALUE;
        int sell1 = 0;
        int buy2 = Integer.MIN_VALUE;
        int sell2 = 0;

        for (int price: prices) {
            if(-price > buy1){
                buy1=-price;
            }
            if(buy1+price>sell1){
                sell1=buy1+price;
            }
            if(sell1-price>buy2){
                buy2=sell1-price;
            }
            if(buy2+price>sell2){
                sell2=buy2+price;
            }
            
        }

        return sell2; 
    
    }
}