public class circularQueue {

   private int front = -1;
   private int rare = -1;
   private int size = 0;
   private int arr [] = new int[10];
   private int n = arr.length;

    public void Add(int val) throws Exception{
        if(size == arr.length){
            throw new Exception("Queue is full...");
        }
        if(size == 0){
            front = rare = 0;
            arr[0] = val;
        } else if (rare < n-1 ) {
            arr[++rare] = val;
        } else if (rare == n-1 && front != 0) {
            rare = 0;
            arr[0] = val;
        }
        size++;
    }

    public int remove() throws Exception{
        if(size == 0){
            throw new Exception("queue is empty");
        }
        int val = arr[front];
        if(front == n-1){
            front = 0;
        } else {
            front++;
        }
        size--;
        return val;

    }

    public void peek() throws  Exception{
        if(size == 0){
            throw new Exception("queue is empty");
        }
    }

    public void display() throws Exception{
        if(size == 0){
            throw new Exception("queue is empty");
        }
        if(front <= rare){
            for (int i = front; i <= rare; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            // rare < front;
            for (int i = front; i < arr.length ; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i <= rare ; i++) {
                System.out.print(arr[i] + " ");

            }
        }
    }

    public static void main(String[] args) throws Exception {

    }
}
