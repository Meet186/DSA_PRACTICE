import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // wraper class
//    Integer k = Integer.valueOf(8);
//        System.out.println(k);
    //Array List
        ArrayList<Integer> l1 = new ArrayList<>();
    // ADD ANY DATATYPE IN ARRAYLIST
    ArrayList l2 = new ArrayList<>();
    l2.add(8);
    l2.add("8");
    l2.add("meet");
    l2.add(78.55);
//        System.out.println(l2);

        // add new elements
        l1.add(5);
        l1.add(8);
        // get an element at index i
//        System.out.println(l1.get(1));
        // print by  loop
        for (int i = 0; i < l1.size(); i++) {
//            System.out.println(l1.get(i));
        }

        // PRINTING THE ARRAYLIST DIRECTLY
//        System.out.println(l1);
        // ADD ELEMENT AT INDEX I
        l1.add(1,11);
//        System.out.println(l1);

        // MODIFY THE VALUE  AT INDEX I
        l1.set(1,200);
//        System.out.println(l1);

        // REMOVE AN ELEMENT AT INDEX I
        l1.remove(1);
//        System.out.println(l1);
        // REMOVE AN ELEMENT Of Value
        l1.remove(Integer.valueOf(8));
//        System.out.println(l1);

        // CHECK AN ELEMENT IS EXIST
        boolean ans = l1.contains(Integer.valueOf(50));
//        System.out.println(ans);
        String name = "My name is meet";
        int ans1 = name.lastIndexOf("t");
//        System.out.println(ans1);

        String emp = "";
//        System.out.println(emp.isEmpty());
//        System.out.println(name.isEmpty());
        l2.add("");
        System.out.println(l2);
//        System.out.println(l2.lastIndexOf("meet"));

//        for (int i = 0; i < l2.size(); i++) {
//            System.out.println(l2.get(i));
//
//        }
    }
}