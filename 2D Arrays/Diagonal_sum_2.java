public class Diagonal_sum_2 {
    public static int DiagonalS( int matrix[][] ){
        int sum = 0;
        for( int i=0; i<matrix.length; i++){
            // for primary diagonal
            sum += matrix[i][i];

            // for secondary diagonal
            if( i != matrix.length-1-i) {
                sum += matrix[i][matrix.length - 1 - i];   // j has been replaced with matrix.length-i-1
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println(DiagonalS( arr ));
    }
}
