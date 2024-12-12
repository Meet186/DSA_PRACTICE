import OOPS.Students;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static class Employ{
        String name;
        String position;
        int salary;
    }



   public static void printName(Employ x ){
       System.out.println(x.name);
   }

    public static void main(String[] args) {

        Employ e1 = new Employ();
        e1.name = "sam";
        e1.position = "SDE2";
        e1.salary = 78000;

        Students s1 = new Students();
        s1.Name = "Harsh";


    }
}