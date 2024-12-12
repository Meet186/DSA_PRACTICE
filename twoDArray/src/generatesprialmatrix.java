import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class generatesprialmatrix {

    static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }

    static int [][] generateSprialMatrix(int n){
       int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;
       int matrix [][] = new int[n][n];
       int curr = 1;

       while (curr <= n*n){
           for (int i = leftCol; i <= rightCol && curr <= n*n; i++) {
               matrix[topRow][i] = curr++;
           }
           topRow++;
           for (int i = topRow; i <=bottomRow && curr <= n*n ; i++) {
               matrix[i][rightCol] = curr++;
           }
           rightCol--;
           for (int i = rightCol; i >=leftCol && curr <= n*n ; i--) {
               matrix[bottomRow][i] = curr++;
           }
           bottomRow--;
           for (int i = bottomRow; i >=topRow  && curr <= n*n; i--) {
               matrix[i][leftCol] = curr++;
           }
           leftCol++;
       }
       return matrix;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER n ");
        int n = sc.nextInt();
        int ans [][] = generateSprialMatrix(n);
        printMatrix(ans);

    }
}
