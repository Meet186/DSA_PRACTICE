import java.util.Arrays;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void print2dArray(int [] [] arr){
        for(int [] el : arr){
            System.out.println(Arrays.toString(el));
        }
    }
    static void printArray(int [] [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ente Number Of Ror & Column");

        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr [] [] = new int[r][c];

        System.out.println("Enter" + " " + r*c + " " + "Elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        print2dArray(arr);

    }
}