import java.util.*;

public class Leetcode_1420 {
    
    private static int n = 2;
    private static int m = 3;
    private static int k = 1;
    private static int MOD = 1000000007;
    private static int dp[][][] = new int[51][51][101];
    
    private static int solve(int idx, int searchCost, int maxSoFar){
        if(idx == n){
            return (searchCost == k) ? 1 : 0;
        }

        if(dp[idx][searchCost][maxSoFar] != -1) return dp[idx][searchCost][maxSoFar]; 

        int result = 0;
        for(int i=1; i<=m; i++){
            if(i > maxSoFar){
                result = (result + solve(idx + 1, searchCost + 1, i)) % MOD;
            }
            else{
                result = (result + solve(idx + 1, searchCost, maxSoFar)) % MOD;
            }
        }
        return dp[idx][searchCost][maxSoFar] = result;
    }
    public static void main(String[] args) {

        // Initialize dp with -1
        for (int i = 0; i < 51; i++) {
            for (int j = 0; j < 51; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        System.out.println(solve(0, 0, 0));

    }
}
