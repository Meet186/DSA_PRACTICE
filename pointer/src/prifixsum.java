import java.util.Scanner;

public class prifixsum {
    static void printArray(int [] arr){
        for(int el : arr){
            System.out.print(el + ",");
        }
    }
    static int [] makePrifixArray (int [] arr){
        int  n  = arr.length;
        for (int i = 1; i <n ; i++) {
            arr[i] += arr[i-1];

        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int  n = sc.nextInt();
        int [] arr = new int[n + 1];

        System.out.println("Enter" + n + "Element");
        for (int i = 1; i <= n  ; i++) {
            arr[i] = sc.nextInt();
        }
        int prifixsum [] = makePrifixArray(arr);
        printArray(prifixsum);
        System.out.println("Enter Number Of Query");
        int q = sc.nextInt();
        while (q-- > 0){
            System.out.println("Enter the Range...");
            int l = sc.nextInt();
            int r = sc.nextInt();


            int ans = prifixsum[r] - prifixsum[l-1];
            System.out.println(ans);

        }
    }
}
