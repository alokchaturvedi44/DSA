public class Frog_Jump {

    private static int arr[] = {20, 30, 40, 20};

    private static int minCost(int arr[]) {
        int n = arr.length;
        int dp[] = new int[n];
        for(int i=1; i<n; i++){
            int fj = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
            int sj = Integer.MAX_VALUE;
            if(i > 1){
                sj = dp[i-2] + Math.abs(arr[i] - arr[i-2]);
            }
            dp[i] = Math.min(fj, sj);
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int n = arr.length;
        System.out.println(minCost(arr));
    }
}
