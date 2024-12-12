import java.util.*;
public class selfqueue {
    private int front = -1;
    private int rere = -1;
    private int arr [] = new int[100];
    private int size = 0;
    public void add(int val){
        if(rere == arr.length){
            System.out.println("queue size is full");
            return;
        }
        if(front == -1){
           front = rere = 0;
           arr[0] = val;
        }
        else {
            arr[rere+1] = val;
            rere++;
        }
        size++;
    }
    public int remove(){
        if(size <= 0){
            System.out.println("queue is empty");
            return -1;
        }
        front++;
        size--;
        return arr[front-1];

    }

    public int peek(){
        return arr[front];
    }

    public boolean isEmpty(){
        return arr.length == 0;

    }

    public void display(){
        for (int i = front; i <= rere ; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }
}
