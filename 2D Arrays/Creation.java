import java.util.*;
public class Creation {

    public static boolean search( int matrix[][], int key){

        for( int i=0; i<matrix.length; i++){
            for( int j=0; j<matrix[0].length; j++){
                if( matrix[i][j] == key){
                    System.out.println("The index of the required cell is: ( " + i + ", " + j + " )");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaring a 3-by-3 matrix
        int matrix[][] = new int[3][3];
        int rows = matrix.length;
        int cols = matrix[0].length;  // matrix[0] so that it start from the first row and first column

        // taking input
        for( int i=0; i<rows; i++){
            for( int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element of which you want to get the index: ");
        int key = sc.nextInt();

        // printing
        System.out.println("Your matrix is: ");
        for( int i=0; i<rows; i++){
            for( int j=0; j<cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search( matrix, key);
    }
}
