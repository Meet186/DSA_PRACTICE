import java.util.Scanner;

public class RatinMaze3 {

    static void mazeInRateFor4direction(int row , int col){
        boolean isVisited[][] = new boolean[row][col];
        int maze [][] = {
                {1,1,1},
                {1,1,1},
                {0,0,1}
        };
        helper(0,0,row-1,col-1,"",maze,isVisited);
    }

    static void  helper(int sr,int sc, int er,int ec,String s ,int maze[][],boolean isVisited[][]){
        if(sr < 0 || sc < 0) return;
        if(sr > er || sc > ec) return;
        if(maze[sr][sc] == 0) return;
        if(isVisited[sr][sc] == true) return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }

        isVisited[sr][sc] = true;

        // Right
        helper(sr,sc+1,er,ec,s+"R",maze,isVisited);
        // Down
        helper(sr+1,sc,er,ec,s+"D",maze,isVisited);
        // Left
        helper(sr-1,sc-1,er,ec,s+"L",maze,isVisited);
        // Up
        helper(sr-1,sc,er,ec,s+"U",maze,isVisited);


        // BackTracking
        isVisited[sr][sc] = false;
    }

    static void printMatrix(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number of row & column");
//
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//        System.out.printf("Enter {%d} element",row*col);
//        int maze[][] = new int[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                maze[i][j] = sc.nextInt();
//            }
//        }


        mazeInRateFor4direction(3,3);




    }
}
