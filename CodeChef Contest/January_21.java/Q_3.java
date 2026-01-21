import java.util.*;

public class Q_3 {
    public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  while(t-- >0){
	      int n = sc.nextInt();
	      int m = sc.nextInt();
	      int a[] = new int[n];
	      int b[] = new int[m];
	      for(int i=0; i<n; i++){
	          a[i] = sc.nextInt();
	      }
	      for(int i=0; i<m; i++){
	          b[i] = sc.nextInt();
	      }
	      Arrays.sort(a);
	      Arrays.sort(b);
	      int i=0, j=0;
	      while(i<n && j<m){
	          if(a[i] < b[j]){
	              i++;
	          }
	          else{
	              break;
	          }
	      }
	      int result = 0;
	      while(i<n && j<m){
	          if(( i<n && j<m) && (a[i] > b[j])){
	              result += n-i;
	              j++;
	          }
	          else if(( i<n && j<m) && ( a[i] == b[j])){
	              i++;
	          }
	          else{
	              i++;
	          }
	      }
	      System.out.println(result);
	  }
	}
}
