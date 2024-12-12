import java.util.Scanner;

public class numbersystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int binaryNumber = sc.nextInt();
        int num = binaryNumber;
        int ans = 0;
        int power = 1;

        while (binaryNumber > 0){
            int unit_Digit = binaryNumber % 10;
            ans += (unit_Digit * power);

            binaryNumber /= 10;
            power  *= 2;

        }
        System.out.println("Decimal Number Of " + num + ":"  + ans);
    }
}


