import java.awt.image.BandedSampleModel;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static String triangleType(int[] nums) {
        String ans = "";
        int num1 = nums[0];
        int num2 = nums[1];
        int num3 = nums[2];

        if((num1 + num2 > num2) && (num2 + num3 > 2) && (num1 + num3 > num2)) return "none";
        if(num1 == num2 && num2 == num3){
            ans = "equilateral";
        } else if(num1 == num2 || num1 == num3 || num2 == num3 ){
            ans = "isosceles";
        }  else {
            ans = "scalene";
        }

        return ans;
    }

    static void mergeSort(int[] arr,int si,int ei){
        if(si >= ei) return;
        int mid = si + (ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    static void merge(int[] arr,int si,int mid,int ei){
        int n1 = mid-si+1;
        int n2 = ei-mid;
        int[] left = new int[n1];
        int[] right  = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[si+i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid+1+i];
        }
        int l = 0;
        int m = 0;
        int index = si;
        while (l < n1 && m < n2){
            if(left[l] <= right[m]){
                arr[index] = left[l];
                l++;
            } else {
                arr[index] = right[m];
                m++;
            }
            index++;
        }
        while (l < n1){
            arr[index++] = left[l++];
        }
        while (m < n2){
            arr[index++] = right[m++];
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {8,4,2};
        mergeSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}