import java.util.*;

public class Q2 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            int a = Math.min(x, z);
            int b = y / 2;         
                
            System.out.println(a + b);
	    } 
	}
}
