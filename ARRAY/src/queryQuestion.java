import java.util.Scanner;

public class queryQuestion {


    static void printArray(int [] arr){
        for (int el : arr){
            System.out.print(el + ",");
        }
    }

    static int [] prifixSum(int arr []){

        int  n = arr.length;
        int pref [] = new int[n];
        pref[0] = arr[0];

        for (int i = 1; i <n ; i++) {
            pref[i] = pref[i] + pref[i-1];

        }
        return pref;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr []  = {4,7,8,9,3,2};

        int ans  [] = prifixSum(arr);
        printArray(ans);


    }
}
