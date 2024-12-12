import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        user obj = new user();
        String user [] = new String[4];

        user [0] = obj.username(name);


        System.out.println(user[0]);




    }
}


 class user {

    user(){
        System.out.println("I am constructure.");
    }


    public String username(String name){
        return name;
    }

}
