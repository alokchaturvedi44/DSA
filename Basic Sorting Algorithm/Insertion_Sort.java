import java.util.*;
public class Insertion_Sort {
    public static void Insertion( int arr[] ){
        for( int i=1; i< arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // finding out correct position for insertion.
            while( prev >= 0 && arr[prev] > curr ){
                arr[ prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[ prev + 1] = curr;
        }
    }
    public static void print( int arr[] ){
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
        Insertion( arr );
        print( arr );
    }
}
