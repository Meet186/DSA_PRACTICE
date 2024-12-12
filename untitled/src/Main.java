import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void print(int n ){
        if(n == 0) return;
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
//    List<String> crickters = Arrays.asList("Virat-Kholi","Rohit-Sharma","Steve-Smith",
//            "Hardick-Pandya","Glen-Maxwell","De-coke","Lathem","Nanu"
//    );
////    crickters.forEach(System.out::println);
//    Collections.sort(crickters,((o1, o2) ->
//            o1.length() - o2.length()
//            ));
//        Collections.shuffle(crickters);
////        crickters.forEach(System.out::println);
//        Collections.swap(crickters,0,5);
//        crickters.forEach(System.out::println);

        print(4);







    }

}

