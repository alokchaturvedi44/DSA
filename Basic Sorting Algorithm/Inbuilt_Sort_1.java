// to import inbuilt sort for ascending order
import java.util.Arrays;

public class Inbuilt_Sort_1 {

    public static void print( int arr[] ){
        System.out.println("Your sorted array is: ");
        for( int i=0; i< arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,11,4,1,3,2};

        // for ascending order
//        Arrays.sort(arr);
//        print(arr);
//        System.out.println();

        // to sort from 0th index to 2nd index
        Arrays.sort(arr, 0,3);
        print(arr);
    }
}
