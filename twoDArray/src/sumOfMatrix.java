import java.util.Scanner;

public class sumOfMatrix {


    static void printMatrix(int matrix [][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }

    static void matrixSum(int [][]a, int r1 , int c1, int [][]b,int r2,int c2){
        if(r1 != r2  && c1 != c2){
            System.out.println("WRONG MATRIX INPUT UNABLE TOO SUM.");
            return;
        }
        int sum [][] = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum [i][j] = a[i][j] + b[i][j];

            }

        }
        printMatrix(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//  MATXIX 1
        System.out.println("Enter First Matrix Row & Columns");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int matrix1 [][] = new int[r1][c1];

        System.out.println("Enter" + r1*c1 + " " + "Elements");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }

        }

//  MATRIX 2

        System.out.println("Enter Second Matrix Row & Columns");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int matrix2 [][] = new int[r2][c2];

        System.out.println("Enter" + r2*c2 + " " + "Elements");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }

        }


        System.out.println("martix 1");
        printMatrix(matrix1);
        System.out.println("martix 2");
        printMatrix(matrix2);

        System.out.println("sum....");
        matrixSum(matrix1,r1,c1,matrix2,r2,c2);

    }
}