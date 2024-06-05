public class Spiral_Matrix {
    public static void Spiral( int matrix[][] ){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
         while( startRow <= endRow && startCol <= endCol) {

             // top boundary --> row(i) is constant ( i.e  0)  and column(j) is variable( i.e  0,1,2,3)
             for (int j = startCol; j <= endCol; j++) {
                 System.out.print(matrix[startRow][j] + ", ");
             }
             // right boundary --> i is variable( i.e  startrow+1 = 1,2,3) and j is constant ( i.e  endcol = 3)
             for (int i = startRow + 1; i <= endRow; i++) {
                 System.out.print(matrix[i][endCol] + ", ");
             }
             // bottom boundary --> i is constant( i.e  endrow = 3) and j is variable( i.e endcol-1 = 2 to startcol = 0 )
             for (int j = endCol - 1; j >= startCol; j--) {
                 if( startRow == endRow){
                     break;  // so that the element which has been printed in top loop did not print again here in bottom loop
                 }
                 System.out.print(matrix[endRow][j] + ", ");
             }
             // left boundary --> i is variable( i.e endrow-1 = 2 to startrow+1 = 1) and j is constant( i.e startcol = 0)
             for (int i = endRow - 1; i >= startRow + 1; i--) {
                 if( startCol == endCol){
                     break;  // so that the element which has been printed in right loop did not print again here in left loop
                 }
                 System.out.print(matrix[i][startCol] + ", ");
             }
             // updatation to enter in inner boundary
             startRow++;
             startCol++;
             endRow--;
             endCol--;
         }
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,17},
                       {5,6,7,8,18},
                       {9,10,11,12,19},
                       {13,14,15,16,20},
                       {21,22,23,24,25}};

        Spiral(arr);
    }
}
