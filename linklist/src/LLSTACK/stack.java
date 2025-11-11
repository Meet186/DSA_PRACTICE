package LLSTACK;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public  class stack {
    Node head = null;
    private int size;
    public void push(int val){
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }
    public int peack(){
        return head.val;
    }
    public int pop(){
        size--;
        int top = head.val;
        head = head.next;
        return top;
    }
    public int size(){
        return size;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val  + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

