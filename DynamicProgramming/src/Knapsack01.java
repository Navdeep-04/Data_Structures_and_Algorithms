public class Knapsack01 {
    static int knapsack(int[] weights, int[] profits, int capacity){
        int[][] dp = new int[weights.length][capacity+1];

        for(int i = 0; i < weights.length; i++){
            dp[i][0] = 0;
        }

        for(int j = 0; j <= capacity; j++){
            dp[0][j] = 0;
        }

        for(int i = 1; i < weights.length; i++){
            for(int j = 0; j <= capacity; j++){
                if(j < weights[i]){
                    dp[i][j] = dp[i-1][j];
                }
                else {
                    int exc = dp[i-1][j];
                    int inc = profits[i] + dp[i-1][j - weights[i]];
                    dp[i][j] = Math.max(exc, inc);
                }
            }
        }
        return dp[weights.length-1][capacity];
    }
    public static void main(String[] args) {
        int[] weights = {0,3,4,5,6};
        int[] profits = {0,2,3,4,1};
        int capacity = 8;
        System.out.println(knapsack(weights, profits,capacity));
    }
}

