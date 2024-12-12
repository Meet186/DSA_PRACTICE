import javax.script.ScriptContext;
import java.util.Scanner;

public class bitwiseoperator {
    public static void main(String[] args) {
//    int a = 9 , b = 2;
//        System.out.println(a | b);
//        System.out.println(a & b);
//        System.out.println(a ^ b);
//        System.out.println(~a);
//        System.out.println(a << b);
//        System.out.println(a >> b);


        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for (int i = r; i >=1 ; i--) {

            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int j = r; j >=i ; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
