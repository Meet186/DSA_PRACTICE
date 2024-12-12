public class queueByLinkList {
    private class Node{
        int val ;
        Node next;

        Node (int val){
            this.val = val;
        }
    }
    Node front = null;
    Node rare = null;
    int size = 0;
    public void add(int val){
        Node temp = new Node(val);
        if(size == 0){
           front = rare = temp;
        } else {
            rare.next = temp;
            rare = temp;
        }
        size++;

    }
    public int remove(){
        if(size == 0) return -1;
        int val = front.val;
        front = front.next;
        size--;
        return val;
    }
    public int peek(){
        return front.val;
    }
    public int size(){
        return size;
    }

    public void display(){
        Node curr = front;
        while (curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();

    }
    public boolean isEmpty(){
        return size == 0;
    }

}
