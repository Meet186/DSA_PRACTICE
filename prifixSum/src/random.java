import java.util.Scanner;

public class random {
    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
    static int [] makefrequencyArray(int arr []){
        int freq [] = new int[100005];
        for (int i = 0; i < arr.length; i++) {
              freq[arr[i]]++;

        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr  [] = {1,2,5,7,8,11,15};

        int ans [] = makefrequencyArray(arr);

        System.out.println("Enter Querys");
        int q = sc.nextInt();
        while (q-- > 1){
            System.out.println("ente element to find ");
            int n = sc.nextInt();
            if(ans[n] >0 ){
                System.out.println("present");
            } else {
                System.out.println("not present");
            }
        }


    }
}
