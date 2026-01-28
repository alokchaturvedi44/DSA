import java.util.*;

public class Q3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            
            int ans = Integer.MAX_VALUE;
    
            for (int i=0; i<=n; i+=k){
                ans = Math.min(ans, Math.abs(x - i));
            }
        
            System.out.println(ans);
        }
    }
}
