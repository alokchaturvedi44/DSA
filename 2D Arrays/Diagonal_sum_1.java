public class Diagonal_sum_1 {
  /* this method is basic Brute force method with a time complexiety of O(n^2) */
    public static int Diagonal( int matrix[][] ){
        int sum = 0;
        for( int i=0; i<matrix.length; i++){
            for( int j=0; j<=matrix[0].length; j++){
                if( i==j ){
                    sum += matrix[i][j];
                }
                else if( i+j == matrix.length-1 ){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
       int arr[][] = {{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        System.out.println( Diagonal(arr) );
    }
}
