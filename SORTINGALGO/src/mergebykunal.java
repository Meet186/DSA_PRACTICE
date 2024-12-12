import java.util.Arrays;

public class mergebykunal {
    public static void main(String[] args) {
        int arr [] = {7,4,5,9,11,2,0};
        int ans [] = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int [] mergeSort(int arr []){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int left [] = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int right [] = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int [] merge(int first[],int second []){
        int merged [] = new int[first.length+ second.length];
        int i = 0, j=0,k=0;
        while (i < first.length && j < second.length){
            if(first[i] < second[j]){
                merged[k] = first[i];
                i++;
            } else {
                merged[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length){
            merged[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            merged[k] = second[i];
            j++;
            k++;
        }

        return merged;
    }



}
