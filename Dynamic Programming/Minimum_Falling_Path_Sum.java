import java.util.Arrays;

public class Minimum_Falling_Path_Sum {
    private static int matrix[][] = {{2,1,3},{6,5,4},{7,8,9}};
    static int n = matrix.length;

    // Memoization
    private static int solve(int row, int col, int dp[][]){
        if(col < 0 || col >= n) return (int) 1e9;

        if(row == n-1) return matrix[row][col];

        if(dp[row][col] != -1) return dp[row][col];

        int down = solve(row+1, col, dp);
        int left_d = solve(row+1, col-1, dp);
        int right_d = solve(row+1, col+1, dp);

        int ans = matrix[row][col] + Math.min(down, Math.min(left_d, right_d));
        
        return dp[row][col] = ans;
    }

    // Tabulation
    private static int solve2(){
        int dp[][] = new int[n][n];

        for(int j=0; j<n; j++){
            dp[n-1][j] = matrix[n-1][j];
        }

        for(int row=n-2; row>=0; row--){
            for(int col=0; col<n; col++){
                int down = dp[row+1][col];
                int left_d = (col > 0) ? dp[row+1][col-1] : (int) 1e9;
                int right_d = (col < n-1) ? dp[row+1][col+1] : (int) 1e9;

                dp[row][col] = matrix[row][col] + Math.min(down, Math.min(left_d, right_d));
            }
        }
        int result = (int) 1e9;
        for(int col=0; col<n; col++){
            result = Math.min(result, dp[0][col]);
        }
        return result;
    }
    public static void main(String[] args) {
        int dp[][] = new int[n][n];
        for(int row[] : dp){
            Arrays.fill(row, -1);
        }

        int result = (int) 1e9;
        for(int j=0; j<n; j++){
            result = Math.min(result, solve(0, j, dp));
        }
        System.out.println(result);

        System.out.println(solve2());


        // Space Optimization
        int ahead[] = new int[n];
        for(int j=0; j<n; j++){
            ahead[j] = matrix[n-1][j];
        }

        int curr[] = new int[n];
        for(int i=n-2; i>=0; i--){
            for(int j=0; j<n; j++){
                int down = ahead[j];
                int left_d = (j > 0) ? ahead[j-1] : (int) 1e9;
                int right_d = (j < n-1) ? ahead[j+1] : (int) 1e9;

                curr[j] = matrix[i][j] + Math.min(down, Math.min(left_d, right_d));
            }
            ahead = curr.clone();
        }
        int result2 = (int) 1e9;
        for(int j=0; j<n; j++){
            result2 = Math.min(result2, ahead[j]);
        }
        System.out.println(result2);
    }
}
