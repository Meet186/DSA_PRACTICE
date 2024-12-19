public class nQueen {

    static void nQueen(int n){
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        helper(board,0);
    }
    private static void helper(char[][] board, int row) {
        int n = board.length;
        if(row == n){
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            return;
        }
        for (int j = 0; j < n; j++) {
            if(isSafe(board,row,j)){ // check right place to fit queen
                board[row][j] = 'Q';
                helper(board,row + 1); // recurssive call
                board[row][j] = 'X'; // BackTracking
            }
        }
    }
   static boolean isSafe(char board [][] , int row,int col) {
       int n = board.length;
       for (int j = 0; j < n; j++) { // check entire East & West
           if (board[row][j] == 'Q') return false;
       }

       for (int i = 0; i < n; i++) { // check entire North & South
           if(board[i][col] == 'Q') return false;
       }
       int i = row;
       int j = col;

       while (i >= 0 && j < n){ // Check South East
           if(board[i][j] == 'Q') return false;
           i--;
           j++;
       }
       i = row;
       j = col;
       while (i < n && j < n){
           if(board[i][j] == 'Q') return false;
           i++;
           j++;
       }

       i = row;
       j = col;
       while (i < n && j >= 0){
           if(board[i][j] == 'Q') return false;
           i++;
           j--;
       }

       i = row;
       j = col;

       while (i >= 0 && j >= 0){
           if(board[i][j] == 'Q') return false;
           i--;
           j--;
       }
       return true;

   }
    public static void main(String[] args) {
        nQueen(4);
    }
}
