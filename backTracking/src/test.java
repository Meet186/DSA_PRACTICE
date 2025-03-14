import java.util.ArrayList;
import java.util.List;

public class test {

    static List<List<String>> nQueen(int n){
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        helper(board,0,ans);
        return ans;
    }
    private static void helper(char[][] board, int row,List<List<String>> ans) {
        int n = board.length;
        if(row == n){
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String str = "";
                for (int j = 0; j < n; j++) {
                    str += board[i][j];
                }
                temp.add(str);
            }
            ans.add(temp);
            return;
        }
        for (int j = 0; j < n; j++) {
            if(isSafe(board,row,j)){ // check right place to fit queen
                board[row][j] = 'Q';
                helper(board,row + 1,ans); // recurssive call
                board[row][j] = '.'; // BackTracking
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
        List<List<String>> ans = nQueen(4);
        System.out.println(ans);
    }
}
