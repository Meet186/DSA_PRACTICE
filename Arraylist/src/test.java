import java.util.Scanner;

public class test {

    static int [][] transpose(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        int transpose [][] = new int[r][c];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j <r ; j++) {
                transpose[i][j] = matrix[j][i];

            }

        }
        return transpose;
    }

    static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row &  columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int total = r*c;
        System.out.println("Enter " + total + " Elements");
        int matrix [][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();

            }

        }

        printMatrix(matrix);
        int ans [][] = transpose(matrix);
        printMatrix(ans);
    }
}
