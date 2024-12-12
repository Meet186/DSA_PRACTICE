import java.util.*;
public class Main {

    public static class myHashMap<k,v>{

        public static final int DEAFULT_CAPACITY = 16;
        public static final  Float LOAD_FACTOR = 0.75f;
        public int n = 0;

        public int size(){
            return n;

        }

        private class Node{
            k key ;
            v value;
            Node(k key, v value){
                this.key = key;
                this.value = value;
            }
        }
        LinkedList<Node> [] bucket;
        public myHashMap(){
            initBucket(DEAFULT_CAPACITY);
        }
        private void initBucket(int N){
            bucket = new LinkedList[N];
            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new LinkedList<>();
            }
        }
        private int hashFun(k key){
            int hi = key.hashCode();
            return Math.abs(hi) % bucket.length;
        }
        private int searchInBucket(LinkedList<Node> ll , k key){
            for (int i = 0; i < ll.size(); i++) {
                if(ll.get(i).key == key){
                    // if element exist return its index
                    return i;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> [] oldBucket = bucket;
            initBucket(bucket.length * 2);
            n = 0;
            for(var bucket : oldBucket){
                for(var node : bucket){
                    put(node.key,node.value);
                }
            }

        }

        public void put(k key, v value){
            int bi = hashFun(key);
            LinkedList<Node> currBucket = bucket[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei != -1){
                // update the  value..
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            } else {
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            }

            //tresholdvalue = DEAFULT_CAPACITY/LOAD_FACTOR
            if(n >= bucket.length * LOAD_FACTOR){
                rehash();
            }
        }
        public v get(k key){
            int bi = hashFun(key);
            LinkedList<Node> currBucket = bucket[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei != -1){
                // element is exist..
                Node currNode = currBucket.get(ei);
                 v val = currNode.value;
                 return val;
            }
            return null;
        }
        public v remove(k key){
            int bi = hashFun(key);
            LinkedList<Node> currBucket = bucket[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei != -1){
                // element is exist..
                Node currNode = currBucket.get(ei);
                v val = currNode.value;
                currBucket.remove(ei);
                return val;
            }
            return null;
        }
    }




    public static void main(String[] args) {

        myHashMap<Integer,String> map = new myHashMap<>();
        map.put(1,"meet");
        map.put(2,"nanish");
        map.put(3,"kushagra");
        map.put(3,"harsh");
        map.put(4,"sheryansh");
        map.remove(3);

        System.out.println(map.get(3));






    }
}