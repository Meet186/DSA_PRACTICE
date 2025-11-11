public class maze4direction {
    static void MazePath4direction(int row,int col){
        boolean isVisited [][] = new boolean[row][col];
        helper(0,0,row-1,col-1,"",isVisited);
    }
    static void helper(int sr,int sc,int er,int ec,String s , boolean isvisited [][]){
        if(sr < 0 || sc < 0) return;
        if(sr > er || sc > ec) return;
        if(isvisited[sr][sc] == true) return;

        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        isvisited[sr][sc] = true;
        // move right
        helper( sr, sc + 1, er, ec, s + "R",  isvisited );
        // move down
        helper( sr + 1, sc , er, ec, s + "D",  isvisited );
        // move left
        helper( sr, sc - 1, er, ec, s + "L",  isvisited );
        // move up
        helper( sr - 1, sc, er, ec, s + "U",  isvisited );

        // Back-Tracking
        isvisited[sr][sc] = false;
    }



    public static void main(String[] args) {
        MazePath4direction(3,3);
    }
}
