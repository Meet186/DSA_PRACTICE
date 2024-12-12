public class Main {
    public static void main(String[] args) {
        int choclate [] = {10,45,10,10,2};
        int students = 3;
        int ans = maxChoclate(choclate,students);
        System.out.println(ans);
    }

    static int maxChoclate(int choclate [], int students){

        int si = 1;
        int ei = (int) 1e9;
        int ans = 0;
        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(isDistrubutionPossible(choclate,students,mid)){
                ans = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return ans;
    }

    static boolean isDistrubutionPossible(int arr[],int students,int maxChoclate){
       int totalStudents = 1;
       int choclate = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxChoclate) return false;
            if( choclate + arr[i] <= maxChoclate){
                choclate += arr[i];
            } else {
                choclate = arr[i];
                totalStudents++;
            }

        }

        if(totalStudents > students) return false;
        return true;

    }

    public static class questions {

        public static void printNode(Node head){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public static class Node{
            int data;
            Node next;
            Node(int data) {
                this.data = data;
            }
        }

        public static void main(String[] args) {
           Node a = new Node(12);
           Node b = new Node(1);
           Node c = new Node(11);
           Node d = new Node(10);
           Node e = new Node(18);
           a.next = b;
           b.next = c;
           c.next = d;
           d.next = e;




        }

        // nth Node from last;

        public static Node nthNode(Node head,int n){
            // TC - o(N)
            //  SC - O(1)
            int size = 0;
            Node temp = head;
            while (temp != null){
                size++;
                temp = temp.next;
            }
            temp = head;
            int m = size - n + 1;
            for (int i = 1; i <= m - 1 ; i++) {
                temp = temp.next;
            }
            return temp;
        }
        public static Node nthNode2(Node head,int n){
            // TC - o(N)
            //  SC - O(1)


            Node slow = head;
            Node fast = head;

            for (int i = 1; i <= n  ; i++) {
                fast = fast.next;
            }
            while (fast != null){
                slow = slow.next;
                fast = fast.next;

            }
            return slow;
        }
        static void removeNthNodeFromLast(Node head,int n){

            Node slow = head;
            Node fast = head;


            for (int i = 1; i <=n ; i++) {
                fast = fast.next;
            }
            // Edge Case
            if(fast == null) {
              head.data = head.next.data;
              head.next = head.next.next;
              return;
            }

            while (fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;

        }
        static Node intersection(Node heada , Node headb){
            Node headA = heada;
            Node headB = headb;
            int lenghtA = 0;
            while (headA != null){
                lenghtA++;
                headA = headA.next;
            }
            int lenghtB = 0;
            while (headB != null){
                lenghtB++;
                headB = headB.next;
            }
            headA = heada;
            headB = headb;

            if(lenghtA > lenghtB){
                int step = lenghtA - lenghtB;
                for (int i = 1; i <= step ; i++) {
                    headA = headA.next;
                }
            } else {
                int step = lenghtB - lenghtA;
                for (int i = 1; i <= step ; i++) {
                    headB = headB.next;

                }
            }

            while (headA != headB){
              headA =  headA.next;
              headB =  headB.next;
            }

            return headA;
        }




    }
}