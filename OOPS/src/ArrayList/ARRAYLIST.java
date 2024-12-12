package ArrayList;

import java.util.Arrays;

public class ARRAYLIST <E> {
    Object [] arr = new Object[1];
    int idx = 0;
    int size = 0;
    public ARRAYLIST(){};
    public void add(E el){
        if(size == arr.length){
            resize();
        }
        arr[idx] = el;
        idx++;
        size++;
    }
    private void resize() {
        int newCapacity = arr.length * 2 ;
        Object [] newarray = new Object[newCapacity];
        System.arraycopy(arr,0,newarray,0,arr.length);
        arr = newarray;
    }
    public void size(){
        System.out.println(size);
    }
    public void printList(){
        System.out.println(Arrays.toString(arr));
    }
    public void changeEl(int idx,int el){
        arr[idx] = el;
    }
   public E get(int index){
        if(index < 0 && index >= size){
            throw new IndexOutOfBoundsException("not exist");
        }
       return (E) arr[index];
   }
}
