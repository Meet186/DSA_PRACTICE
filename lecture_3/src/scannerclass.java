import java.util.Scanner;

public class scannerclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        System.out.println("hey" +  name + "your age is :" + age);

    }
}
