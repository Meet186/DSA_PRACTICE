public class objectandclass {
    public static void main(String[] args) {
        car obj = new car();
//        System.out.println(obj.price);
        student s1 = new student();
        s1.name = "Meet";
        s1.rollNO = 18;
        student s2 = new student();
        s2.rollNO = 45;
        s2.name = "Harsh";

        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println(s1.rollNO);
        System.out.println(s2.rollNO);
    }
}

class car {
    String name = "'Mg'";
    int price = 789999;

}
class student{
    int rollNO ;
    String name ;

}

