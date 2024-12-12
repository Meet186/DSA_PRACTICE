public class test {

    static String comopress(String str){
        int count = 1;
        char prevch = str.charAt(0);
        String ans = "";
        for (int i = 1; i < str.length(); i++) {
            char currch = str.charAt(i);
            if(currch != prevch){
                ans += count;
                ans += prevch;
                count = 1;
                prevch = currch;
            } else  {
                if(count == 9){
                    ans += count;
                    ans += prevch;
                    count = 1;
                } else {
                    count++;
                }
            }

        }
        ans += count;
        ans += prevch;
        return ans;
    }




    public static void main(String[] args) throws Exception {
//        selfqueue q = new selfqueue();
//        for (int i = 0; i < 15; i++) {
//            q.add(i);
//        }
//        q.display();
//        q.remove();
//        q.display();
//        q.remove();
//        q.remove();
//        q.display();
//        System.out.println(q.getSize());
//        System.out.println(q.peek());

       // queue By LinkList.
//       queueByLinkList q = new queueByLinkList();
//        for (int i = 0; i < 5; i++) {
//            q.add(i);
//
//        }
//       q.display();
//       q.remove();
//       q.display();
//        System.out.println(q.size());


        // circular Queue..
        circularQueue cq = new circularQueue();

        for (int i = 0; i < 10; i++) {
            cq.Add(i);
        }
//        cq.display();
//        cq.remove();
//       cq.remove();
//        cq.Add(45);
//        cq.Add(35);
//        cq.display();
    }
}
