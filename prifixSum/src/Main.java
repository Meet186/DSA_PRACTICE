import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void printArray(int arr []){
        for (int el : arr){
            System.out.print(el + ",");
        }
    }
    static int [] prifixSum(int [] arr){
        int n = arr.length;
        int ans [] = new int[n];
        ans[0] = arr[0];
        for (int i = 1; i <n ; i++) {
            ans[i] = ans[i-1] + arr[i];
        }
        return ans;
    }

    static int [] sufficSum(int [] arr){
        int n = arr.length;
        int suff [] = new int[n];
        suff[n-1] = arr[n-1];

        for (int i = n-2; i >=0 ; i--) {
            suff[i] = suff[i] + arr[i+1];

        }
        return suff;

    }
    static void suffix2(int [] arr){
        int  n = arr.length;

        for (int i = n-2; i >=0 ; i--) {
            arr[i] += arr[i+1] ;

        }
    }

    static int calculateArraySum(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static boolean arrayPartion(int [] arr){
        int totalSum = calculateArraySum(arr);
        int prifixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prifixSum += arr[i];
            int suffixSum = totalSum - prifixSum;
            if(suffixSum == prifixSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr [] = {1,2,3,4,5};

//        System.out.println(arrayPartion(arr));


//        System.out.println("Enter Number of Query Ask");
//        int q = sc.nextInt();
//        int prifix [] = prifixSum(arr);
//        while (q-- > 0){
//            System.out.println("Enter the range");
//            int l = sc.nextInt();
//            int r = sc.nextInt();
//
//            int ans = prifix[r] -  prifix[l] ;
//            System.out.println(ans);
//        }

    }
}