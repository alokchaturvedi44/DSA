import java.util.*;
public class Selection_Sort {
    public static void Selection( int arr[] ){
        for( int i=0; i<arr.length-1; i++){
            int minposition = i;
            for( int j=i+1; j<arr.length; j++){
                if( arr[minposition]> arr[j]){
                    minposition = j;
                }
                //swap
                int temp = arr[minposition];
                arr[minposition] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void print( int arr[]){
        System.out.println("Your sorted array is: ");
        for( int i=0; i< arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[n];
        for( int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        for( int i=0; i< arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        Selection( arr );
        print( arr );
    }
}
