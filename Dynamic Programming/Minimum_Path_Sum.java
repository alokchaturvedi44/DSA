public class Minimum_Path_Sum {
    static int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};

    public static void main(String[] args) {
        int m = grid.length;
        int n = grid[0].length;

        int dp[][] = new int[m][n];
        int sum = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j==0){
                    dp[i][j] = grid[i][j];
                    continue;
                }

                int up = grid[i][j];
                if(i > 0){
                    up += dp[i-1][j];
                }
                else up += (int) 1e9;

                int left = grid[i][j];
                if(j > 0){
                    left += dp[i][j-1];
                }
                else left += (int) 1e9;

                dp[i][j] = Math.min(up, left);
            }
        }
        System.out.println(dp[m-1][n-1]);


        // Space Optimized
        int prev[] = new int[n];
        for(int i=0; i<m; i++){
            int temp[] = new int[n];
            for(int j=0; j<n; j++){
                if(i == 0 && j == 0){
                    temp[j] = grid[i][j];
                    continue;
                }

                int up = grid[i][j];
                if(i > 0) up += prev[j];
                else up += (int) 1e9;
                
                int left = grid[i][j];
                if(j > 0) left += temp[j-1];
                else left += (int) 1e9;

                temp[j] = Math.min(up, left);
            }
            prev = temp;
        }
        System.out.println(prev[n-1]);
    }
}
