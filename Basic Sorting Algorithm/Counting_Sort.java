import java.util.*;
public class Counting_Sort {
    public static void Counting( int arr[] ){

        // to get the range of the original array that is the largest element of that array
        int largest = Integer.MIN_VALUE;
        for( int i=0; i< arr.length; i++){
            largest = Math.max( largest, arr[i]);
        }

        // to get the frequency of each element of original array. The frequency will be stored in 'count' array
        int count[] = new int[largest + 1];
        for( int i=0; i< arr.length; i++){
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for( int i=0; i< count.length; i++){
            while( count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void print( int arr[] ){
        System.out.println("Your sorted array is: ");
        for( int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,8,9,5,4,1,2,3,1,9,7,6};
        Counting( arr );
        print( arr );
    }
}
