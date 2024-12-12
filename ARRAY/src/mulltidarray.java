import java.util.Arrays;

public class mulltidarray {

    static void printArray(int [] arr){
        for ( int el : arr){
            System.out.print(el + ",");

        }
    }


    static void reverseArray(int [] arr){
        int i=0,j=arr.length-1;
        while (i < j){
            swapArray(arr,i,j);
            i++;
            j--;
        }

    }

    static void swapArray(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int [] reverseArraybyK(int arr [] , int k){
        int n = arr.length;
        int j = 0;
        k = k%n;
        int ans [] = new int[n];

        for (int i = n-k; i < n ; i++) {

            ans[j++] = arr[i];
        }

        for (int i = 0; i < n-k ; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }

    static int [] reverse(int [] arr){
        int n = arr.length;
        int ans [] = new int[n];
        int j = 0;
        for (int i = n - 1; i >=1 ; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr1 [][] = new int[2][3];
        int arr2 [][] = {{45,23},{24,20,10}};

        int arr [] = {1,7,8,4,5,3,7,0};

      int ans [] =  reverse(arr);
       printArray(ans);

    }

}
