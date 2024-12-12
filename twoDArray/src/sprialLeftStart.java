import java.util.Scanner;
public class sprialLeftStart {

    static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }


    static int [][] sprialMatrix(int n){
        int matrix[][] = new int[n][n];
        int topRow =0, leftcol = 0, rightCol = n-1, bottomRow = n-1;
        int curr = 1;


        while (curr <= n * n){
            for (int i = topRow; i <= bottomRow && curr <= n*n; i++) {
                matrix[i][leftcol] = curr++;
            }
            leftcol++;
            for (int i = leftcol; i <=rightCol && curr <= n*n; i++) {
                matrix[bottomRow][i] = curr++;
            }
            bottomRow--;
            for (int i = bottomRow; i >=topRow && curr <= n*n ; i--) {
                matrix[i][rightCol] = curr++;

            }
            rightCol--;
            for (int i = rightCol; i >=leftcol && curr <= n*n ; i--) {
                matrix[topRow][i] = curr++;

            }
            topRow++;


        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        int ans [][] = sprialMatrix(n);
        printMatrix(ans);
    }
}
