public class Climbing_Stairs {
    private static int solve(int prev, int curr, int n){
        for(int i=2; i<=n; i++){
            int temp = curr;
            curr += prev;
            prev = temp;
        }
        return curr;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(solve(1, 1, n));
    }
}