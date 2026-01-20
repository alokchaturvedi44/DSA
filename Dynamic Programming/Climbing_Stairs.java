public class Climbing_Stairs {
    public static void main(String[] args) {
        int n = 6;

        int prev = 1, curr = 1, result = 1;
        for(int i=2; i<=n; i++){
            result = prev + curr;
            prev = curr;
            curr = result;
        }
        System.out.println(result);
    }
}
