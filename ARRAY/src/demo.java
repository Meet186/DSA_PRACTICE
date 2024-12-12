import java.util.Scanner;

public class demo {

    static void printArray(int [] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
    }

    static void print2D(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
    static void reverseArray(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;

        }
    }

    static int [][] pascalPrint(int n ){
        int ans [][] = new int[n][];

        for (int i = 0; i < n; i++) {
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];


            }
        }
        return ans;
    }

    static void swap(int arr [], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void reverseArray2(int arr[], int i, int j){

        while (i< j){
            swap(arr,i,j);
            i++;
            j--;
        }

    }


    static int [] rotateArrayByK(int arr [], int k){
        int n = arr.length;
        k = k%n;

        reverseArray2(arr,0,n-k-1);
        reverseArray2(arr,n-k,n-1);
        reverseArray2(arr,0,n-1);

        return arr;
    }

    public static void main(String[] args) {
        int arr [] = {1,4,5,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k ");
        int k = sc.nextInt();

      int ans [] =   rotateArrayByK(arr,k);
        printArray(ans);

     }
}
