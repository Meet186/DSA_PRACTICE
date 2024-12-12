import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class reverseArraylist {

    static void reverseArrayList( ArrayList <Integer> li ){
        int left = 0;
        int right = li.size() - 1;

        while (left < right){
            swap(li,left,right);
            left++;
            right--;

        }

    }
    static void swap (ArrayList<Integer> li , int left , int right){
        int temp = li.get(left);
        li.set(left,li.get(right));
        li.set(right,temp);

    }

    static ArrayList reverseArray2(ArrayList li ){
        ArrayList l2 = new ArrayList<>();

        for (int i = li.size() - 1; i >= 0 ; i--) {
            l2.add(li.get(i));

        }
        return l2;
    }

    public static void main(String[] args) {
       ArrayList <Integer> l1 = new ArrayList<>();
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of elements");
        int n = sc.nextInt();

        System.out.println("Enter" + n + "Elements");
        for (int i = 0; i < n; i++) {
            l1.add(sc.nextInt());

        }

        System.out.println(l1);
//        reverseArrayList(l1);
//            ArrayList l2 = reverseArray2(l1);
//        System.out.println(l2);
            Collections.reverse(l1);
//        System.out.println(l1);
        // {SORT A  ARRAYLIST}
        // ASSANDING ORDER
        Collections.sort(l1);
        System.out.println(l1);
        // DESSINDING ORDER
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
    }
}
