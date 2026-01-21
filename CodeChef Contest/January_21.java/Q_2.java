import java.util.*;

public class Q_2 {
    public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  while(t-- >0){
	      int n = sc.nextInt();
	      int count[] = new int[n+1];
	      for(int i=0; i<n; i++){
	          int color = sc.nextInt();
	          count[color]++;
	      }
	      
	      int maxFreq = 0;
	      int result = 1;
	      
	      for(int i=1; i<=n; i++){
	          if(count[i] > maxFreq){
	              maxFreq = count[i];
	              result = i;
	          }
	      }
	      System.out.println(result);
        }
	}
}
