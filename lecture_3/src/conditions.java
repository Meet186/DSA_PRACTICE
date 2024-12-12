import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//////        switch..
//        System.out.println("Ente course number");
//        int course = sc.nextInt();
//        switch (course){
//            case 1:
//                System.out.println("java");
//                break;
//            case 2:
//                System.out.println("python");
//                break;
//            default:
//                System.out.println("No course avalibale");
//        }
//        if-else condition
        System.out.println("Enter Number");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
