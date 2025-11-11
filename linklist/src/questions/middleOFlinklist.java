package questions;
import LinkLIST.linklist;



public class middleOFlinklist {


   static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a  = new Node(4);
        Node b  = new Node(44);
        a.next = b;
        b.next = a;
        int ans = cyclePoinyt(a);
        System.out.println(ans);


    }

    static void display(Node head){
       Node temp = head;
       while (temp != null){
           System.out.print(temp.data + " ");
           temp = temp.next;
       }
    }
    static boolean isCycle(Node head){
       Node slow = head;
       Node fast = head;
        while (fast != null){
            if(head == null) return false;
            if(head.next == null) return false;
            if(slow.next == null) return  false;
            slow = slow.next;
            if(fast.next == null) return false;
            fast = fast.next.next;
            if(slow == fast) return true ;
        }
        return false;
    }

    static int cyclePoinyt(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;
            }

            while (slow != fast){
                slow = slow.next;
                if(fast == null) return -1;
                fast = fast.next;
            }

            return slow.data;
        }
        return -1;
    }
}
