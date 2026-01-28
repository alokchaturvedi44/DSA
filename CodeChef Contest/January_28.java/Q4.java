import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            }
            boolean[] present = new boolean[n + 2];
            int count = 0;
            
            for(int x : arr) {
                if (x == 1) {
                    present[1] = true;
                    count++;
                } 
                else{
                    if(present[x - 1]){
                        present[x] = true;
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
