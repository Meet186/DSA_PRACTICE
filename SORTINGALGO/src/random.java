import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class random {
    public static void main(String[] args) {
        int arr[] = {12,8,16,5,3,9,0,2};
        float array [] = {0.28f,0.78f,0.01f,0.008f};

        floatBucket(array);
        System.out.println(Arrays.toString(array));

    }

    static void bucketSort(int arr []){
        int n = arr.length;
        int max = maxNUm(arr);
        ArrayList<Integer> bucket [] = new ArrayList[max + 1];

        for (int i = 0; i <= max ; i++) {
            bucket[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int bucketIndex = arr[i];
            bucket[bucketIndex].add(arr[i]);
        }
        int index = 0;
        for (int i = 0; i <= max; i++) {
            for(int el : bucket[i]){
                arr[index++] = el;
            }
        }

    }

    static void floatBucket(float arr []){
        int n = arr.length;
        ArrayList<Float> bucket [] = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<Float>();
        }
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * 10;
            bucket[bucketIndex].add(arr[i]);
        }
        for (int i = 0; i < bucket.length; i++) {
            Collections.sort(bucket[i]);
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            for(float el : bucket[i]){
                arr[index++] = el;
            }

        }
    }

    static int maxNUm(int arr []){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }
}