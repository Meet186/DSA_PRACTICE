import java.util.Scanner;

public class transposeOfMatrix {

    static void printMatrix(int matrix [][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
    static int [][] transpose(int [][] matrix,int r1,int c1){
        int transpose [][] = new int[c1][r1];
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < r1; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;

    }
    static void inPlaceTranspose(int [][] matrix, int r1,int c1){
        // {only work for same row and columns}
        for (int i = 0; i < c1;i++) {
            for (int j = i; j < r1; j++) {
            // swap the value.
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix Rows &  Column  ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int matrix [][] = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix[i][j] = sc.nextInt();

            }

        }

        System.out.println("transpose of matrix is ...");
       inPlaceTranspose(matrix,r1,c1);
        printMatrix(matrix);
    }
}
