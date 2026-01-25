public class Unique_Path {

    // Memoization
    private static int solve(int i, int j, int dp[][]){
        if(i == 0 && j == 0) return 1;
        if(i<0 || j<0) return 0;

        int up = solve(i-1, j, dp);
        int left = solve(i, j-1, dp);

        return up + left;
    }
    public static void main(String[] args) {
        int m = 3, n = 7;
        int dp[][] = new int[m][n];
        System.out.println(solve(m-1, n-1, dp));

        // Bottom Up
        dp[0][0] = 1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j==0){
                    dp[i][j] = 1;
                    continue;
                }

                int up=0, left=0;

                if(i>0) up = dp[i-1][j];
                if(j>0) left = dp[i][j-1];

                dp[i][j] = up+left;
            }
        }
        System.out.println(dp[m-1][n-1]);

        
        // Space Optimized
        int prev[] = new int[n];
        for(int i=0; i<m; i++){
            int temp[] = new int[n];
            for(int j=0; j<n; j++){
                if(i == 0 && j == 0){
                    temp[j] = 1;
                    continue;
                }
                int up = 0;
                int left = 0;

                if(i > 0) up = prev[j];
                if(j > 0) left = temp[j-1];

                temp[j] = up + left;
            }
            prev = temp;
        }
        System.out.println(prev[n-1]);
    }
}
