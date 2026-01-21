import java.util.*;

public class Q_4 {
    public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  while(t-- >0){
          int n = sc.nextInt();
          int a[] = new int[n+1];
          int pvt = 0;
          for(int i=1; i<=n; i++){
              a[i] = sc.nextInt();
              if(a[i] != i){
                  pvt = i;
              }
          }
          if(pvt == 0){
              System.out.println(0);
          }
          else{
            System.out.println(a[pvt]);
          }
	  }
	}
}
