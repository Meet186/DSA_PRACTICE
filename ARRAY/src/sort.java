
import java.util.*;
public class sort {
    public static void main(String[] args) {
         int arr [] = {5,4,3,2,1,0};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int arr []){
        // TC - O(N)
        // SC - O(1)
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;


        }

    }




}