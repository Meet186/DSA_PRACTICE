import java.util.Scanner;

public class decimalnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimalNumber = sc.nextInt();
        int ans = 0;
        int pw = 1;

        while (decimalNumber > 0){
            int piratyNumber = decimalNumber % 2;
            ans += piratyNumber * pw;
            pw *= 10;
            decimalNumber /= 2;
        }
        System.out.println(ans);
    }
}
