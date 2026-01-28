import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t >= 200){
            System.out.println(t - 50);
        }
        else{
	      System.out.println(t);
	    }
	}
}
