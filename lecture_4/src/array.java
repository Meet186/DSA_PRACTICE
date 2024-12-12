import java.awt.image.BandedSampleModel;
import java.util.Arrays;

public class array {

    static void printArray(int [][] arr){
        for(int [] el : arr){
            System.out.print(Arrays.toString(el));
        }
    }

    static int[][] target(int[] arr, int target){
        int ans [][] = {{}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {

                if(arr[i] + arr[j] == target){
                    ans = new int[][] {{arr[i],arr[j]}};
                }
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int arr [] = {1,4,5,7,8};
        int ans [][] = target(arr,9);
        printArray(ans);
    }
}
