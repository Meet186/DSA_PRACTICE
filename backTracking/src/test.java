import java.util.ArrayList;
import java.util.List;

public class test {

   static void nQueen(int row){
       char board[][] = new char[row][row];
       for (int i = 0; i < row; i++) {
           for (int j = 0; j < row; j++) {
               board[i][j] = 'X';

           }
       }
       helper(board,0);
   }

   static void helper(char[][] board,int row){
       if(row == board.length-1){
           System.out.println();
           for (int i = 0; i < board.length; i++) {
               for (int j = 0; j < board.length; j++) {
                   System.out.print(board[i][j] + " ");

               }
               System.out.println();
           }
           return;
       }

       for (int i = 0; i < board.length; i++) {
           if(isSafe(board,row,i)){
               board[row][i] = 'Q';
               helper(board, row+1);
               board[row][i] = 'X';
           }

       }
   }

   private  static  boolean isSafe(char[][] board,int row , int col){
       for (int i = 0; i < board.length; i++) {
           if(board[row][i] == 'Q') return false;
       }
       for (int j = 0; j < board.length; j++) {
           if(board[j][col] == 'Q') return false;
       }
       // i++ j++
       int i = row;
       int j = col;
       while (i < board.length-1 && j < board.length-1){
           if(board[i][j] == 'Q') return false;
           i++;
           j++;
       }
       i = row;
       j = col;
       // i-- j--;
       while (i >=0 && j >=0){
           if(board[i][j] == 'Q') return false;
           i--;
           j--;
       }
       // i++ j--;
       i = row;
       j = col;
       while (i < board.length-1 && j >=0){
           if(board[i][j] == 'Q') return false;
           i++;
           j--;
       }
       i = row;
       j = col;
       // i-- j++;
       while (i >=0 && j < board.length-1){
           if(board[i][j] == 'Q') return false;
           i--;
           j++;
       }

       return true;
   }

   static List<List<String>> mazein4D(int row){
       List<List<String>> ans = new ArrayList<>();
       boolean[][] isVisited = new boolean[row][row];
       helper("",isVisited,0,0,ans);
       return ans;
   }

    private static void helper(String p, boolean[][] isVisited, int row, int col,List<List<String>> ans) {
       if(row == isVisited.length-1 && col == isVisited.length-1){
           List<String> temp = new ArrayList<>();
           temp.add(p);
           ans.add(temp);
           return;
       }
       if(isVisited[row][col]) return;
       isVisited[row][col] = true;
       if(row < isVisited.length-1){ // MOVE DOWN
           helper("D"+p,isVisited,row+1,col,ans);
       }
       if(col < isVisited.length-1){ // MOVE RIGHT
           helper("R"+p,isVisited,row,col+1,ans);
       }
       if(row  > 0){ // MOVE LEFT
           helper("L"+p,isVisited,row-1,col,ans);
       }
       if(col > 0){ // MOVE UPEER
           helper("U"+p,isVisited,row,col-1,ans);
       }
       isVisited[row][col] = false; // BACKTRACK
    }
    public static void main(String[] args) {

        System.out.println( mazein4D(3));
    }
}
