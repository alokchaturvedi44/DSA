import java.util.*;

public class Triangle {
    private static List<List<Integer>> triangle = new ArrayList<>();

    // Memoization
    private static int solve(int i, int j, int dp[][], int n){
        if(dp[i][j] != -1) return dp[i][j];
        
        if(i == n-1) return triangle.get(i).get(j);
        
        int down = triangle.get(i).get(j) + solve(i+1, j, dp, n);
        int diagonal = triangle.get(i).get(j) + solve(i+1, j+1, dp, n);
        
        return dp[i][j] = Math.min(down, diagonal);
    }

    // Tabulation
    private static int solve2(List<List<Integer>> triangle, int n){
        int dp[][] = new int[n][n];
        
        for(int j=0; j<n; j++){
            dp[n-1][j] = triangle.get(n-1).get(j);
        }

        for(int i=n-2; i>=0; i--){
            for(int j=i; j>=0; j--){
                int down = triangle.get(i).get(j) + dp[i+1][j];
                int diagonal = triangle.get(i).get(j) + dp[i+1][j+1];

                dp[i][j] = Math.min(down, diagonal);
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args) {
        List<Integer> row1 = Arrays.asList(2);
        List<Integer> row2 = Arrays.asList(3, 4);
        List<Integer> row3 = Arrays.asList(6, 5, 7);
        List<Integer> row4 = Arrays.asList(4, 1, 8, 3);
        triangle.add(row1);
        triangle.add(row2);
        triangle.add(row3);
        triangle.add(row4);
        int n = triangle.size();
        
        int dp[][] = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(solve(0, 0, dp, n));

        System.out.println(solve2(triangle, n));

        // Space Optimized
        int ahead[] = new int[n];
        int curr[] = new int[n];
        
        for(int j=0; j<n; j++){
            ahead[j] = triangle.get(n-1).get(j);
        }

        for(int i=n-2; i>=0; i--){
            for(int j=i; j>=0; j--){
                int down = triangle.get(i).get(j) + ahead[j];
                int diagonal = triangle.get(i).get(j) + ahead[j+1];

                curr[j] = Math.min(down, diagonal);
            }
            ahead = curr.clone();
        }
        System.out.println(ahead[0]);
    }
}
