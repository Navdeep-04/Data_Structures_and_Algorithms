import java.util.Arrays;
public class MinimumCoinChange {
    public static void main(String[] args) {
        int[] coins = {2, 4};
        int amount = 7;
        int[][] dp = new int[coins.length][amount+1];

        //1st col
        for(int i = 0; i < coins.length; i++){
            dp[i][0] = 0;
        }

        //1st row
        for(int i = 1; i <= amount; i++){
            if(i % coins[0] == 0){
                dp[0][i] = i / coins[0];
            }else{
                dp[0][i] = amount + 1;
            }
        }

        for(int i = 1; i < coins.length; i++){
            for(int j = 1; j <= amount; j++){
                if(j < coins[i]){
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.min(dp[i-1][j], 1 + dp[i][(j - coins[i])]);
                }
            }
        }

        if(dp[coins.length - 1][amount] > amount) {
            System.out.println("Not possible");
        }
        else{
            System.out.println(dp[coins.length - 1][amount]);
        }

        for(int[] i : dp){
            System.out.println(Arrays.toString(i));
        }
    }
}
