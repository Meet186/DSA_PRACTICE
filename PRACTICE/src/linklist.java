public class linklist {
  private Node head = null;
  private Node tail = null;

   public void add(int val){
       Node temp = new Node(val);
       if(head == null){
           head = temp;
           tail = temp;
       } else {
           tail.next = temp;
           tail = temp;
       }
   }

   public void insertAt(int idx,int val){
        Node t = new Node(val);
        Node temp = head;
       if(idx > size()){
           System.out.println("idx is larger than size..");
           return;
       }
       if(idx == 0){
           t.next = head;
           head = t;
           return;
       }
       if(idx == size()){
           t.next = tail;
           tail = t;
           return;

       }
       for (int i = 1; i < idx; i++) {
           temp = temp.next;
       }
       t.next = temp.next;
       temp.next = t;
   }

   public void display(){
       Node temp = head;
       if(head == null) return;
       while (temp != null){
           System.out.print(temp.data + " ");
           temp = temp.next;
       }
       System.out.println();
   }

   public int size(){
       Node temp = head;
       int count = 0;
       if(head == null) return 0;
       while (temp != null){
           count++;
           temp = temp.next;
       }
       return count;
   }

   public void delete(int idx){
       Node temp = head;
       if(idx == 0){
           head = head.next;
           return;
       }
       for (int i = 1; i <= idx - 1; i++) {
           temp = temp.next;
       }
       temp.next = temp.next.next;
       if(idx == size()){
           tail = temp;
       }
   }

   public boolean contains(int val){
       Node temp = head;

       while (temp != null){
           if(temp.data == val) return true;
           temp = temp.next;
       }
       return false;
   }

   public void getHead(){
       System.out.println(head.data);
   }
   public void getTail(){
        System.out.println(tail.data);
   }


}

  class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}