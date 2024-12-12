import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void display(Queue<Integer> q){
        System.out.println(q);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Basic STL
        Queue<Integer> q = new LinkedList<>(); // use linklist or ArrayDeque;
//        Queue<Integer> q1 = new ArrayDeque<>(); // use linklist or ArrayDeque;
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }
        display(q);
        q.poll(); // remove a element;
        display(q);
        q.remove(); // remove a element
        display(q);
        System.out.println(q.element()); // give top element;
        System.out.println(q.peek()); // give top element;


    }
}