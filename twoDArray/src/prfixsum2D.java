import java.util.Scanner;

public class prfixsum2D {

    static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }

    static void prefMatrix(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix [i][j] += matrix[i][j-1];
            }
        }
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }
    static int findSum3(int [][] matrix, int r1,int c1,int r2,int c2){
        int sum = 0, upperbox = 0, leftbox = 0 , upperdouble = 0, ans = 0  ;
        prefMatrix(matrix);
        sum = matrix[r2][c2];
        if(r1 >= 1){
            upperbox = matrix[r1-1][c2];
        }
        if(c1 >= 1){
            leftbox = matrix[r2][c1-1];
        }
        if(r1 >=1 && c1 >= 1){
            upperdouble = matrix[r1-1][c1-1];
        }
         ans = sum - upperbox - leftbox + upperdouble;
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of row & columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix [][] = new int[r][c];
        int total = r * c;

        System.out.println("Enter" + total+ "elements");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();

            }

        }

        System.out.println("Enter the rectangle conrdinate : r1,c1 to r2,c2 ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        System.out.println("original matrix is :");
        printMatrix(matrix);
        System.out.println("sum is" + findSum3(matrix,r1,c1,r2,c2));


    }
}
