import java.util.Scanner;

public class random {

    static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
    }

    static void prefSum(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j <matrix[i].length ; j++) {
                matrix[i][j] += matrix[i][j-1];

            }
        }
        prefSumCol(matrix);

    }

    static int rectangularSum(int matrix [][] , int r1, int c1, int r2, int c2){
        int sum = 0, ans = 0 , topBox = 0, leftBox = 0, leftDouble = 0 ;
        prefSum(matrix);
        sum = matrix[r2][c2];
        if(r1 >= 1){
            topBox = matrix[r1 - 1][c2];
        }
        if(c1 >= 1){
            leftBox = matrix[r2][c1-1];
        }
        if(r1 >=1 && c1 >= 1){
            leftDouble = matrix[r1-1][c1-1];

        }

        ans = sum - topBox - leftBox  + leftDouble;

       return ans ;
    }

    static void prefSumCol(int matrix [][]){
        int r = matrix.length;
        int c = matrix[0].length;

        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i-1][j];


            }

        }
    }
    public static void main(String[] args)
    {
         Scanner sc  = new Scanner(System.in);
        System.out.println("Enter number of rows ans columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int total = r*c;
        System.out.println("Enter " + total + " Elements"  );
        int matrix [][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();

            }

        }

        System.out.println("Original matrix =>");
        printMatrix(matrix);
        System.out.println("Enter r1,c1,r2,c2");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int ans = rectangularSum(matrix,r1,c1,r2,c2);
        System.out.println(ans);

    }
}
