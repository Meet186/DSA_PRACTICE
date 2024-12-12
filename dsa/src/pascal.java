import java.util.ArrayList;
import java.util.List;

public class pascal {

    static void print(int matrix [][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print( " " + matrix[i][j] + " ");

            }
            System.out.println();

        }
    }

    public int [][] pascal(int n){
        int ans [][] = new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int ans [][] = obj.pascalTriangle(5);
        print(ans);
    }
}
