import java.util.Arrays;
import java.util.Scanner;

public class prifixsum {

    static void printArray(int [] arr){
        for(int el : arr){
            System.out.print(el + ",");
        }
    }
    static void print2DArray(int [][] arr){
        for(int [] el : arr){
            System.out.print(Arrays.toString(el));
        }
    }

    static int [] makePrifixArray(int [] arr){
        int n = arr.length;
        int pref [] = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i <n ; i++) {
            pref[i] = arr[i] + pref[i-1];

        }
        return pref;
    }

    static void targetSum(int [] arr , int target) {
        int n = arr.length;


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    int[][] ans  =  new int[][] {{arr[i],arr[j]}};
                    print2DArray(ans);
                }

            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {1,4,7,8,9,0};

        int prifixsum [] =  makePrifixArray(arr);
        System.out.println("Enter Number Of Query");
        int q = sc.nextInt();

        while (q-- > 0){
            System.out.println("Enter Range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prifixsum[r] - prifixsum[l-1] ;
            System.out.println(ans);
        }



    }
}
