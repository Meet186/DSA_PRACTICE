import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class random {
    static int[] rearrange_El(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        int positive_Index = 0;
        int negative_Index = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0){ // Positive
                result[positive_Index] = arr[i];
                positive_Index += 2;
            } else { // Negative
                result[negative_Index] = arr[i];
                negative_Index += 2;
            }
        }
        return result;
    }
    static void print_Zigzag(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            if(i % 2 != 0){
                for (int j = matrix.length - 1; j >=0 ; j--) {
                    System.out.print(matrix[i][j]);
                }
            } else {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        
    }
}
