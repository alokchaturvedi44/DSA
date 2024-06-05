public class N_Queens_placement {

    public static void nQueens(char board[][], int row){
        // base case
        if(row == board.length){
            printBoard(board);
            return;
        }
        // column loop
        for(int j=0; j<board.length; j++){
            board[row][j] = 'Q';
            nQueens(board, row+1);
            board[row][j] = 'x';
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("------- chess board -------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        // initialize
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
    }
}
