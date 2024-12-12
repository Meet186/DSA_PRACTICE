public class MazePath {


    static int mazePath(int n , int m){
        if(n == 1 && m == 1) return 1;
        int rightWay = 0;
        int downWay = 0;
        if(n == 1){
            rightWay += mazePath(n,m-1);
        }
        if(m == 1){
            downWay += mazePath(n-1,m);
        }
        if(n > 1 && m > 1) {
            rightWay += mazePath(n,m-1);
            downWay += mazePath(n-1,m);

        }
        return rightWay + downWay;

    }

   static int revereseNum(int n,int rev){
        if(n == 0) return  rev;
        rev = rev * 10 + n % 10;
        return revereseNum(n/10,rev);

   }

   static void rateInMaze4direction(int row ,int col){
        boolean isvisited [][] = new boolean[row][col];
        helepr(0,0,row-1,col-1,"",isvisited);
   }

   static void helepr(int sr,int sc,int er,int ec,String s ,boolean isVisited[][]){
        if(sr < 0 || sc < 0) return;
        if(sr > er || sc > ec) return;
        if(isVisited[sr][sc] == true) return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        // Rigth
       helepr(sr,sc+1,er,ec,s+"R",isVisited);
        // Down
       helepr(sr+1,sc,er,ec,s+"D",isVisited);
        // Left
       helepr(sr,sc-1,er,ec,s+"L",isVisited);
        // Up
       helepr(sr-1,sc,er,ec,s+"U",isVisited);
       // Back-Tracking
       isVisited[sr][sc] = false;

   }

    public static void main(String[] args) {
           rateInMaze4direction(3,3);
    }
}
