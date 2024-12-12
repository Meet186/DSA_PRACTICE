import java.util.Scanner;

public class m2 {

    public void spiralOrder(int[][] matrix) {
        int toprow = 0;
        int lastrowindex = matrix.length-1;
        int leftcol = 0;
        int rightCol = matrix[0].length-1;
        int total = 0;
        int el = matrix.length * matrix[0].length;


        while (total < el){
            for (int i = toprow; i <= rightCol && total < el ; i++) {
            System.out.print(matrix[toprow][i] + " ");
            total++;
        }
        toprow++;
        for (int i = toprow; i <=lastrowindex &&  total < el  ; i++) {
            System.out.print(matrix[i][rightCol] + " ");
            total++;
        }
        rightCol--;
        for (int i = rightCol; i >=leftcol &&  total < el ; i--) {
            System.out.print(matrix[lastrowindex][i] + " ");
            total++;
        }
        lastrowindex--;
        for (int i = lastrowindex; i >=toprow &&  total < el ; i--) {
            System.out.print(matrix[i][leftcol] + " ");
            total++;
        }
        leftcol++;
        }



    }

    static void printmatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of rows & column of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int total = r * c;
        int matrix [][] = new int[r][c];
        System.out.println("Enter" + " " + total + " " + "Elements");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();

            }

        }

        System.out.println("Input Matrix is ....");
        printmatrix(matrix);
        System.out.println("Sprial Matrix is ....");


    }
}
