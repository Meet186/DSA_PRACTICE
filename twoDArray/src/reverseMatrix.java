import java.util.Arrays;

public class reverseMatrix {
    public static void main(String[] args) {

            int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
            int ans [][] = reverseMatrix(arr);
            for (int el [] : ans){
                System.out.println(Arrays.toString(el));
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

    static int [][] reverseMatrix(int matrix [][]) {
        int row = matrix.length;
        int columns = matrix[0].length;
        int reverse[][] = new int[columns][row];
        int transpose [][] = transpose(matrix,row,columns);
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < row; j++) {
                reverse[i][j] = transpose[i][row-1-j];

            }
        }
        return reverse;
    }

    static void reverseRow(int matrix [][]){
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[0].length-1;

            while (start <= end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    static void  reverseColumn(int matrix [][]){
        int row = matrix.length;
        int colum = matrix[0].length;

        for (int i = 0; i < colum; i++) {
            int start = 0;
            int end = row-1;

            while (start < end){
                int temp = matrix[start][i];
                matrix[start][i] = matrix[end][i];
                matrix[end][i] = temp;
                start++;
                end--;
            }

        }
    }
}
