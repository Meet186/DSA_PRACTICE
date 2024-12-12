import java.util.Scanner;
public class sprialprint {

    static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSprialOrder(int [][] matrix,int r , int c){
        int topRow = 0 , bottommRow = r-1, leftCol = 0, rightCol = c-1;
        int totalElement = 0;
        while (totalElement < r*c){
            // topRow -> leftcol to rightCol
            for (int i = topRow; i <= rightCol  && totalElement < r*c; i++) {
                System.out.print(matrix[topRow][i] + " ");
                totalElement++;
            }
            topRow++;
            // rightcol -> toprow to bottom row
            for (int i = topRow; i <=bottommRow  && totalElement < r*c; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;
            // bottomrow -> rightcol to leftcol

            for (int i = rightCol; i >= leftCol  && totalElement < r*c ; i--) {
                System.out.print(matrix[bottommRow][i] + " ");
                totalElement++;
            }
            bottommRow--;
            //leftcol -> bottomrow to toprow
            for (int i = bottommRow; i >= topRow  && totalElement < r*c ; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElement++;
            }
            leftCol++;
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
        printMatrix(matrix);
        System.out.println("Sprial Matrix is ....");
        printSprialOrder(matrix,r,c);
    }

}