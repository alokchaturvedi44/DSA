public class Ninja_Training {
    private static int mat[][] = {{1,2,5},
                                  {3,1,1},
                                  {3,3,3}};

    // Memoization
    private static int solve(int day, int last, int dp[][]){
        if(dp[day][last] != 0) return dp[day][last];
        
        if(day == 0){
            int maxi = 0;
            for(int task=0; task<3; task++){
                if(task != last){
                    maxi = Math.max(maxi, mat[0][task]);
                }
            }
            return dp[day][last] =  maxi;
        }
        int maxi = 0;
        
        for(int task=0; task<3; task++){
            if(task != last){
                int point = mat[day][task] + solve(day-1, task, dp);
                maxi = Math.max(maxi, point);
            }
        }
        return dp[day][last] = maxi;
    }
    public static void main(String[] args) {
        int n = mat.length;
        int dp[][] = new int[n][4];
        System.out.println(solve(n-1, 3, dp));

        // Bottom Up
        dp[0][0] = Math.max(mat[0][1], mat[0][2]);
        dp[0][1] = Math.max(mat[0][0], mat[0][2]);
        dp[0][2] = Math.max(mat[0][0], mat[0][1]);
        dp[0][3] = Math.max(mat[0][0], Math.max(mat[0][1], mat[0][2]));
        
        for(int day=1; day<n; day++){
            for(int last=0; last<4; last++){
                dp[day][last] = 0;
                for(int task=0; task<3; task++){
                    if(task != last){
                        int point = mat[day][task] + dp[day-1][task];
                        dp[day][last] = Math.max(dp[day][last], point);
                    }
                }
            }
        }
    
        System.out.println(dp[n-1][3]);



        // Space Optimized 
        int[] prev = new int[4];

        prev[0] = Math.max(mat[0][1], mat[0][2]);
        prev[1] = Math.max(mat[0][0], mat[0][2]);
        prev[2] = Math.max(mat[0][0], mat[0][1]);
        prev[3] = Math.max(mat[0][0], Math.max(mat[0][1], mat[0][2]));
                   
        for (int day=1; day<n; day++) {
            int[] temp = new int[4];

            for (int last=0; last<4; last++) {
                temp[last] = 0;
                for (int task=0; task<=2; task++) {
                    if (task != last) {
                        temp[last] = Math.max(temp[last], mat[day][task] + prev[task]);
                    }
                }
            }
            prev = temp;
        }
        System.out.println(prev[3]);
    }
}
