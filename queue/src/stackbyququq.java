import java.util.*;
public class stackbyququq {
    private Queue<Integer> q = new LinkedList<>();
    private int size = 0;
    public void push(int x){
        q.add(x);
        size++;
    }
    public int peek(){
        for (int i = 1 ; i <= q.size() - 1; i++) {
            q.add(q.remove());
        }
        int peeek = q.peek();
        q.add(q.remove());
        return peeek;
    }
    public int remove(){
        for (int i = 1; i <= q.size() - 1; i++) {
            q.add(q.remove());
        }
        size--;
        return q.remove();
    }

    public boolean isEmpty(){
        return q.size() == 0;

    }
    public int size(){
        return size;

    }

    public  void display( ){
        System.out.println(q);
    }


}
