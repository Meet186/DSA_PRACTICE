import java.util.Scanner;

class Algebra {

    int a ,  b;

    Algebra(int x, int y){
        System.out.println("constructor is here .");
        a = x;
        b = y;
    }


     int sum(){
        int ans = a + b;
        return  ans;
    }
    int sub(){
        int ans = a - b;
        return  ans;
    }
    int mul(){
        int ans = a * b;
        return  ans;
    }


}


public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Algebra obj = new Algebra(a,b);


        System.out.println(obj.sum());
        System.out.println(obj.sub());
        System.out.println(obj.mul());




//        System.out.println(Math.sqrt(2));
//        System.out.println(Math.pow(4,4))DR;
//        System.out.println(Math.floor(78.7));
//        System.out.println(Math.floor(78.1));
//        System.out.println(Math.ceil(7.8));
//        System.out.println(Math.ceil(7.1));
//        System.out.println(Math.floor(Math.sqrt(2)));





    }
}
