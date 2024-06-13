import java.util.*;
import java.util.Arrays;

public class Binary_Search {
    public static void print( int arr[] ){
        System.out.println("Your sorted array is: ");
        for( int i=0; i< arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static int binary( int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while( start <= end){
            int mid = ( start+end)/2;
            if( arr[mid] == key ){
                return mid;
            }
            if( arr[mid] < key ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[n];
        for( int i=0; i< arr.length; i++){
            arr[i] = sc.nextByte();
        }
        System.out.println("Your array is: ");
        for( int i=0; i< arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println("Enter the element of which you want the index: ");
        int key = sc.nextInt();

        Arrays.sort( arr );
        print(arr);

        int index = binary( arr, key);
        if( index == -1 ){
            System.out.println("Enter the valid element!");
        }
        else{
            System.out.println("The index of the required element is: " + index);
        }


    }
}
