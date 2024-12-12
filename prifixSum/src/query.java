import java.util.Scanner;

public class query {
    static void printArray(int []arr){
        for(int el : arr){
            System.out.print(el + " ");
        }

    }

    static int [] makePrifix(int arr []){
        int n = arr.length;
        int ans [] = new int[n];
        ans[0] = arr[0];

        for (int i = 1; i <n ; i++) {
            ans[i] = ans[i-1] + arr[i];

        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr [] = {1,2,4,7,8,9,10 };
        System.out.println("Enter query");
        int q = sc.nextInt();
        int prifSum [] = makePrifix(arr);

        while (q-- >0){
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prifSum[r-1] - prifSum[l-2];
            System.out.println(ans);
        }

    }

}
