import java.util.Arrays;
// to import inbuilt sort in descending order
import java.util.Collections;
public class Inbuilt_Sort_2 {
    public static void print( Integer arr[] ){
        System.out.println("Your sorted array is: ");
        for( int i=0; i< arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        // int arr[] = {5,4,1,3,2};  'int' is a primitive type variable but 'reverseOrder()' function always works on objects
        // therefore declarinf arr as int type variable will give an error
        Integer arr[] = {5,11,4,1,3,2};

        // to sort each element of arr
//        Arrays.sort( arr, Collections.reverseOrder());
//        print(arr);
//        System.out.println();

        // to sort elements from 0th index to 3rd index
        Arrays.sort( arr, 0, 2, Collections.reverseOrder());
        print(arr);

        }
    }

