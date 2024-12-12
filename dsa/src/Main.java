import java.lang.reflect.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans [] = new int[nums1.length];
        boolean found = false;

        for (int i = 0; i < nums1.length; i++) {
            found = false;
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]){
                    found = true;
                }
                if(found && nums2[j] > nums1[i] ){
                    ans[i] = nums2[j];
                    break;
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            if(ans[i] == 0){
                ans[i] = -1;
            }
        }
        return ans;
    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n-1; i >=0 ; i--) {
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }
        int newNumber [] = new int[n+1];
        newNumber[0] = 1;
        return newNumber;
    }

    static void printArray(int arr []){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }

    static void print2d(int matrix [][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
    }

    public  int [][] pascalTriangle(int  n){
        int ans [][] = new int[n][];

        for (int i = 0; i < n; i++) {
            ans [i] = new int[i+1];
            ans [i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];

            }


        }
        return ans;
    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
    public int heightChecker(int[] heights) {
        int expexted [] =heights.clone();
        Arrays.sort(expexted);
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != expexted[i]){
                count++;
            }

        }

        return count;

    }

    public int removeDuplicates(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           if(i < arr.length-1 && arr[i] == arr[i+1]){
               continue;
           } else {
               arr[count] = arr[i];
               count++;
           }

        }
        return count;
    }


    public void printArray2(int arr []){
        for(int el : arr){
            System.out.print(el + " ");
        }
    }

    public int uniqueArray(int arr []){

        // TC - O(N)
        // SC - O(1)
        Arrays.sort(arr);
        int count = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] <= arr[i-1]){
                int val = arr[i-1] - arr[i] + 1;
                count += val;
                arr[i] += val;
            }
        }
        return count;

        // brut approach
//        int count = 0 ;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[i] == arr[j]){
//                    arr[j] += 1;
//                    count++;
//                }
//
//            }
//            return count;
//        }
    }

    static List<int[]> subArray(int[] arr){
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1 ; j <arr.length+1 ; j++) {
                int[] set = Arrays.copyOfRange(arr,i,j);
                ans.add(set);
            }
        }
        return ans;
    }

    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i+1;
            int rigth = arr.length - 1;

            while (left < rigth){
                int sum = arr[i] + arr[left] + arr[rigth];
                if(sum == 0){
                    result.add(Arrays.asList(arr[i],arr[left],arr[rigth]));
                    left++;
                    rigth--;
                } else if (sum < 0) {
                    left++;
                } else {
                    rigth--;
                }
            }

        }
        return new ArrayList<>(result);

    }


    static int moveZero(int n){
        int moveNumber = 0;
        int factor = 1;
        int countZero = 0;

        while (n > 0){
            int digit = n%10;
            if(digit == 0){
                countZero++;
            } else {
                moveNumber += digit * factor;
                factor *= 10;
            }
            n /= 10;
        }

        while (countZero > 0){
            moveNumber *= 10;
            countZero--;
        }
        return moveNumber;
    }


    static String moveAtLast(String s){
        char ch [] = s.toCharArray();
        int countA = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a') {
                countA++;
            } else {
                ch[i-countA] = ch[i];
            }
        }
        for (int i = ch.length - countA; i < ch.length ; i++) {
            ch[i] = 'a';
        }
        String ans = new String(ch);
        return ans;
    }
    public static  void main(String[] args) {

        Main obj = new Main();
        int arr [] = {9};
        int ans [] = obj.plusOne(arr);
        printArray(ans);



    }
}