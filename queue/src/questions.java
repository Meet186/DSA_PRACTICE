import java.util.*;


public class questions {

    static void reverseQueqe(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while (q.size() > 0){
            st.push(q.remove());
        }
        while (st.size() > 0){
            q.add(st.pop());
        }


    }
    static void reverseQuequKthTime(Queue<Integer> q , int k){
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }
        while (st.size() > 0){
            q.add(st.pop());
        }
        for (int i = 0; i < n-k; i++) {
            q.add(q.remove());
        }


    }

    static List<Integer> FirstNegativeInteger(int arr[], int k) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = i + k -1;

        while (j < arr.length){
            boolean flag = false;
            for(int c = i; c <= j; c++){
                if(arr[c] < 0){
                    res.add(arr[c]);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                res.add(0);
            }
            i++;
            j = i + k -1;
        }




        return res;
    }


    public static void  main(String[] args) throws Exception{
         stackbyququq st = new stackbyququq();
//        Queue<Integer> q = new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        System.out.println(q);
//        reverseQuequKthTime(q,3);
//        System.out.println(q);
         st.push(1);
         st.push(2);
         st.push(3);
         st.push(4);
//         st.display();
        st.remove();
//        st.display();
        int peek = st.peek();
//        System.out.println(peek);
        //-8 2 3 -6 10
        int arr [] = {-8,2,3,-6,10};
        int k = 2;
        List<Integer> rse = FirstNegativeInteger(arr,k);
        System.out.println(rse);


    }
}
