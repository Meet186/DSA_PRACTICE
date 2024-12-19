import java.util.ArrayList;
import java.util.List;

public class knightTour {
    static boolean isSafe(char[][] board,int row,int col){
        int len = board.length;
        int i,j;
        // 2UP1LEFT
        i=row-2;
        j=col+1;

        if(i>=0 && j<len && board[i][j] == 'K') return false;

        //2UP1RIGHT
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && board[i][j] == 'K') return false;

        //2DOWN1LEFT
        i=row+2;
        j=col+1;
        if(i<len && j<len && board[i][j] == 'K') return false;
        //2DOWN1RIGHT
        i=row+2;
        j=col-1;
        if(i<len && j>=0 && board[i][j] == 'K') return false;

        //2RIGHT1UP
        i=row-1;
        j=col+2;
        if(i>=0 && j<len &&board[i][j] == 'K') return false;
        //2RIGHT1DOWN
        i=row+1;
        j=col+2;
        if(i<len && j<len && board[i][j] == 'K') return false;

        //2LEFT1UP
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && board[i][j] == 'K') return false;
        // 2LEFT1DOWN
        i=row+1;
        j=col-2;
        if(i<len && j>=0 && board[i][j] == 'K') return false;
        return true;
    }
    static void nKnight(int row){

        char board [][] = new char[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                board[i][j] = 'X';
            }
        }
        helper(board,0,0,0);
        return ;
    }

    static void helper(char board [][],int row,int col,int num){
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
        } else if (isSafe(board,row,col)) {
            board[row][col] = 'K';
            if(col != n-1) helper(board,row,col+1,num+1);
            else  helper(board,row+1,0,num+1);
            board[row][col] = 'X'; // BACKTRACKING
        }
        if(col != n-1) helper(board,row,col+1,num+1);
        else  helper(board,row+1,0,num+1);

    }

    public static void main(String[] args) {
       nKnight(4);
    }
}
