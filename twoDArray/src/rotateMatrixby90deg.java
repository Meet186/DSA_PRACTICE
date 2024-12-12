import java.util.Scanner;

public class rotateMatrixby90deg {
    static void printMatrix(int matrix [][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
    static void inPlaceTranspose(int [][] matrix, int r1,int c1){
        // {only work for sam erow and columns}
        for (int i = 0; i < c1;i++) {
            for (int j = i; j < r1; j++) {
                // swap the value.
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }

        }
    }


    static void revrese(int []arr){
        int i = 0;
        int j = arr.length - 1;

        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }
    static void rotateMatrixBy90deg(int [][] matrix, int n ){
        //{rows & colums should be equal}
        // transpose by matrix.
        // reverse each row of matrix.

        inPlaceTranspose(matrix,n,n);
        for (int i = 0; i < n; i++) {
            revrese(matrix[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix Rows &  Column ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int matrix [][] = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }

        System.out.println("rotated matrix is ....");
        rotateMatrixBy90deg(matrix,r1);
        printMatrix(matrix);

    }
}
