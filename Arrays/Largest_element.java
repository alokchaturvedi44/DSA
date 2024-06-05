import java.util.*;

public class Largest_element {
    public static void main(String[] args) {
        int arr[] = {5,8,7,11,55,12,66,4578,967,4,5544,7884,58,456};

        int largest = Integer.MIN_VALUE; // it represent '-infinity'
        int smallest = Integer.MAX_VALUE; // it represent '+infinity'

        for( int i=0; i< arr.length; i++){
            largest = Math.max( largest, arr[i]);
            smallest = Math.min( smallest, arr[i]);
        }
        System.out.println("The largest element in the array is: " + largest);
        System.out.println("The smallest element in the array is: " + smallest);

    }
}
