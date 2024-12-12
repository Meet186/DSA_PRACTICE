import java.util.*;

public class Main {
    // Time-Complexlity to serch element in stack is O(N);
    static void pushAtBottom(Stack<Integer> st,int val ){
       if(st.size() == 0){
           st.push(val);
           return;
       }
       int top = st.pop();
       pushAtBottom(st,val);
       st.push(top);
    }

    static void reverse(Stack<Integer> st){
        if(st.size() == 1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }

    static void displayStack(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        displayStack(st);
        System.out.print (top + " ");
        st.push(top);
    }
    static void remove(Stack<Integer>st,int index){
        Stack<Integer> rt = new Stack<>();

        while (st.size() > index + 1){
            rt.push(st.pop());
        }
        st.pop();
        while (rt.size() > 0){
            st.push(rt.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.add(3,8);
//        pushAtBottom(st,898);
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        Stack<Integer> rt = new Stack<>();
//
//        while (st.size() > 0){
//            rt.push(st.pop());
//        }
//        while (rt.size() > 0){
//          int x = rt.pop();
//            System.out.print(x + " ");
//            st.push(x);
//        }

//        displayStack(st);

//        int arr [] = new int[st.size()];
//        int n = arr.length;
//
//        for (int i = n-1 ; i >=0 ; i--) {
//            arr[i] = st.pop();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            st.push(arr[i]);
//        }

//        System.out.println(Arrays.toString(arr));
//        System.out.println(st);
//        remove(st,2);
//        System.out.println(st);
        System.out.println(st);
        reverse(st);
        System.out.println(st);


    }
}