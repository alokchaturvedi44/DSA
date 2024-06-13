import java.util.*;

public class Linear_Search {
    public static int linear( int arr[], int key){
        for( int i=0; i<arr.length; i++){
            if( arr[i] == key){
                return i;
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
        for( int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        for( int i=0; i<arr.length; i++){
            System.out.print( arr[i] + ", ");
        }
        System.out.println();
        System.out.println("Enter the element of which you want to get the index: ");
        int key = sc.nextInt();

        int index = linear( arr, key);
        if( index == -1){
            System.out.println("Enter the valid element!");
        }
        else{
            System.out.println("The index of the required element is: " + index);
        }
    }
}
