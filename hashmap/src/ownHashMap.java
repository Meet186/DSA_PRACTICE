import java.util.LinkedList;
import java.util.List;
public class ownHashMap <k,v>{
    private final int INITIAL_CAPACITY = 16;
    private final float LOAD_FACTOR = 0.75f;
    public int size;
    ownHashMap(){
        initBucket(INITIAL_CAPACITY);
    }
    private LinkedList<Node> [] bucket;
    private void initBucket(int N){
        bucket = new LinkedList[N];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new LinkedList<>();
        }
    }
    private int hasFun(k key){
        int hascode = key.hashCode();
        return Math.abs(hascode) % bucket.length;
    }
    private class Node{
        k key;
        v value;
        Node(k key, v value){
            this.key = key;
            this.value = value;
        }
    }
    private int searchInBucket(LinkedList<Node> ll , k key){
        for (int i = 0; i < ll.size(); i++) {
            if(ll.get(i) == key){
                return i;
            }
        }
        return -1;
    }
    public void put(k key,v value){
        int bi = hasFun(key);
        LinkedList<Node> currBucket = bucket[bi];
        int ei = searchInBucket(currBucket,key);
        if(ei != -1){
            // node alredy exist update the node..
            Node currNode = currBucket.get(ei);
            currNode.value = value;
        } else {
            Node newNode = new Node(key, value);
            currBucket.add(newNode);
            size++;
        }
        if(size >= bucket.length * LOAD_FACTOR){
            // Threshold value = initial_Capacity * loadFactor..
            rehash(bucket.length * 2);
        }
    }
    private void rehash(int N){
        List<Node> [] oldBucket = bucket;
        initBucket(N);
        size = 0;
        for(var bucket : oldBucket ){
            for(var node : bucket){
                put(node.key,node.value);
            }
        }

    }

    public v get(k key){
        int bi = hasFun(key);
        LinkedList<Node> currBucket = bucket[bi];
        int ei = searchInBucket(currBucket,key);
        if(ei != -1){
            // node  exist return the  value..
            Node currentbucket = currBucket.get(ei);
            v value = currentbucket.value;
            return value;
        }
        return null;
    }

    public v remove(k key){
       int bi = hasFun(key);
        LinkedList<Node> currBucket = bucket[bi];
        int ei = searchInBucket(currBucket,key);
        if(ei != -1){
            // node  exist return the  value..
           Node currNode = currBucket.get(ei);
            v val = currNode.value;
            currBucket.remove(ei);
            return val;
        }
        return null;
    }
}
