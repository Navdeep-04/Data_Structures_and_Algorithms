public class BestTimeToBuyAndSellStockApproach1Bruteforce {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(stock(prices));
    }
    static int stock(int[] prices){
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[i] < prices[j]) {
                    int max = prices[j] - prices[i];
                    if(max > profit){
                        profit = max;
                    }
                }
            }
        }
        return profit;
    }
}
