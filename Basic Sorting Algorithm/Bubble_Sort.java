import java.util.*;

public class Bubble_Sort {
    public static void Bubble( int arr[]){
        for( int i=0; i<arr.length-1; i++){
            for( int j=0; j< arr.length-1-i; j++){
                if( arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print( int arr[]){
        System.out.println("Your sorted array is: ");
        for( int i=0; i<arr.length; i++){
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
        Bubble( arr );
        print( arr );
    }
}
