import java.util.Scanner;

public class testing {

    static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }

    }

    static void prefMatrix(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j <matrix[i].length ; j++) {
                matrix[i][j] += matrix[i][j-1];
            }        }
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 1; j <matrix.length ; j++) {
                matrix[j][i] += matrix[i][j-1];
            }

        }
    }

    static int rectuanglarSum(int [][]matrix, int r1,int c1,int r2,int c2){
        int sum = 0,  top= 0,  leftBottom = 0,  left = 0 , ans = 0;
        prefMatrix(matrix);
        sum = matrix[r2][c2];
        if(r1 > 0){
            top = matrix[r1-1][c2];
        }
        if(c2 > 0){
            leftBottom = matrix[r1][c2-1];
        }
        if(r1 > 1 && c1 > 0){
            left = matrix[r1-1][c1-1];

        }


        ans = sum - top - leftBottom + left;

        return ans;

    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Number Of Rows & Columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int total = r*c;
        int matrix[][] = new int[r][c];
        System.out.println("Enter" + " " + total + " " + "Elements");

        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();

            }

        }


        System.out.println("Enter : r1, c1, r2,c2");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.println("Original Matrix is ....");
        printMatrix(matrix);
        int ans = rectuanglarSum(matrix,r1,c1,r2,c2);
        System.out.println("Ans is : " + ans);
    }



}
