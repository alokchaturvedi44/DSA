public class Day_7_1 {
    public static int climbStairs(int n) {
        int prev = 1, curr = 1, result = 1;
        for(int i=2; i<=n ;i++){
            result = prev + curr;
            prev = curr;
            curr = result;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs(n));
    }
}
