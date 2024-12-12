package LinkLIST;

import questions.middleOFlinklist;

public class linklist {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;

    public void getTail(){
        System.out.println(this.tail.data);
    }

    public Node getHead(){
        return head;
    }

    public int getval(int idx){
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

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

    public void insertAtHead(int val){
       Node temp = new Node(val);
       if(head == null){
           head = temp;
           tail = temp;
       } else {
           temp.next = head;
           head = temp;
       }
    }

    public void deleteAt(int idx){
        Node temp = head;
        if(idx == 0){
            head = head.next;
            return;
        }
        for (int i = 1; i <= idx - 1 ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx == sizeofNode(temp)){
            tail = temp;
        }

    }

    public void insertAt(int idx , int val){
        Node t = new Node(val);
        Node temp = head;
        if(idx == sizeofNode(head)){
            add(val);
        }
        if(idx == 0){
            insertAtHead(val);
        }

        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
    }

    private int sizeofNode(Node head) {
        int count = 0;
        Node temp = this.head;
        while (temp != null){
            count++;
            temp = temp.next;

        }
        return count;
    }

    public void size(Node head){
       int count = 0;
       Node temp = this.head;
       while (temp != null){
           count++;
           temp = temp.next;

       }
       System.out.println(count);

    }

   public boolean contain(int val){
        Node temp = head;
       while (temp != null){
           if(temp.data == val) return true;
           temp = temp.next;
       }
       return false;
   }

   public void leftMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while ( fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
       System.out.println(slow.data);
   }

   public void rigthMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while ( fast != null && fast.next != null  ){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

   public void deleteMiddle(Node head){
        // In Case of Even Consider rigth Middle.
       Node slow = head;
       Node fast = head;

       while (fast.next.next != null && fast.next.next.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }
       slow.next = slow.next.next;
   }

   public boolean isCycle(Node head){
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

   public Node cyclePoinyt(Node head){
      Node slow = head;
      Node fast = head;

       while (fast != null && fast.next != null){
           if(slow.next == null) return null;
           slow = slow.next;
           fast = fast.next.next;

           if(slow == fast){
               slow = head;
           }

           while (slow != fast){
               slow = slow.next;
               if(fast == null) return null;
               fast = fast.next;
           }

           return slow;
       }
       return null;
   }

   public Node mergeTwoSortedLinklist(Node list1 , Node list2){
        Node temp1 = list1;
        Node temp2 = list2;
        Node head = new Node(0);
        Node temp = head;

        while (temp1 != null && temp2 != null){
            if(temp1.data < temp2.data){
                Node a = new Node(temp1.data);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            } else {
                Node a = new Node(temp2.data);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }
        if(temp1 == null){
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }
        return head.next;
   }

   public void oddEven(Node head){
       Node temp = head;
       Node evenHead = null;
       Node evenTail = null;
       Node oddHead = null;
       Node oddTail = null;

       while (temp != null){
           if(temp.data % 2 == 0){
               if(evenHead == null){
                   evenHead = evenTail = new Node(temp.data);
               } else {
                   evenTail.next = new Node(temp.data);
                   evenTail = evenTail.next;
               }
           } else {
               if(oddHead == null){
                   oddHead = oddTail = new Node(temp.data);
               } else {
                   oddTail.next = new Node(temp.data);
                   oddTail = oddTail.next;
               }
           }
           temp = temp.next;

       }
       System.out.println("Odd linklist is ...");
        displayByHead(oddHead);
       System.out.println("Even linklist is...");
       displayByHead(evenHead);

   }

   public void sortOddEven(Node head){
        Node temp = head;
        Node odd = new Node(0);
        Node even = new Node(0);
        Node tempO = odd;
        Node tepmE = even;

        while (temp != null){
            if(temp.data % 2 == 0){
                Node add = new Node(temp.data);
                tepmE.next = add;
                tepmE = tepmE.next;

            } else {
                Node add = new Node(temp.data);
                tempO.next = add;
                tempO = tempO.next;

            }
            temp = temp.next;
        }
        odd = odd.next;
        even = even.next;
        tempO.next = even;
        displayByHead(odd);
   }

   public void arrangeListASOddEven(Node head){
       if( head == null || head.next == null ){
           return ;
       }
        Node temp = head;
        Node odd = head;
        Node even = head.next;

        Node evenStart = head.next;

        while (even != null && even.next != null){
            odd.next = even.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenStart;
        displayByHead(temp);

   }

   public Node reverseByRecurssion(Node head){
        if(head.next == null) return head;
        Node newHead = reverseByRecurssion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
   }

   public Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node n = null;

        while (curr != null){
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }

        return prev;
   }


   public void removeDuplicate(Node head){
        Node temp = head;
        while (temp != null && temp.next != null){
            if(temp.next.data == temp.data){
                temp.next = temp.next.next;
            }
            if(temp.next == null) return;
            if(temp.next.data != temp.data){
                temp = temp.next;
            }
        }
   }



   public boolean isPallindrom(Node head){
        Node temp = head;
        Node slow = temp;
        Node fast = temp;

        while ( fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node middle = reverse(slow.next);
        slow.next = middle;

        Node p1 = head;
        Node p2 = slow.next;

        while (p2 != null){
            if(p1.data != p2.data) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
   }


   public int twin(Node head){
        int maxSum = Integer.MIN_VALUE;
        Node temp = head;
        Node slow = temp;
        Node fast = temp;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node middle = reverse(slow.next);
        slow.next = middle;
        Node p1 = head;
        Node p2 = slow.next;

        while (p2 != null){
            int sum = p1.data + p2.data;
            if(sum > maxSum){
                maxSum = sum;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return maxSum;
   }

   public Node deepCopy(Node head){
        Node temp = head;
        Node newhead = new Node(0);
        Node temp2 = newhead;
        while (temp != null){
          Node a = new Node(temp.data);
          temp2.next = a;
          temp2 = a;
          temp = temp.next;
        }
        return newhead.next;

   }

   void displayByHead(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
       System.out.println();
   }

    public void display(){
       Node temp = head;
       while (temp != null){
           System.out.print(temp.data + " ");
          temp = temp.next;
       }
        System.out.println();

   }


}

