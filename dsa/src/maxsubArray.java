import java.util.Arrays;

public class maxsubArray {
    public static void main(String[] args) {
        int arr [] = {-2,1,-3,4,-1,2,1,-5,4};
//        int ans [] = maxsubArray(arr);
//        System.out.println(Arrays.toString(ans));
        int ans = subArray2(arr);
        System.out.println(ans);
    }
    static int [] maxsubArray(int arr []){
        int maxEndEl = Integer
                .MIN_VALUE;
        int currSum = 0;
        int s = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if(maxEndEl < currSum){
                maxEndEl = currSum;
                start = s;
                end = i;
            }
            if(currSum < 0){
                currSum = 0;
                s = i + 1;

            }

        }
        System.out.println("MaxSubArray sum is : " + maxEndEl);
        int ans [] = Arrays.copyOfRange(arr,start,end+1);
        return ans;
    }

    static int maxSubArrayValue(int arr []){
        int sum = 0;
        int maxSum = arr[0];
        int start = 0;
        int end = 0;
        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum > maxSum){
                maxSum = sum;
                start = s;
                end = i;
            }
            if(sum < 0){
                sum = 0;
                s = i + 1;
            }

        }
        int ans [] = Arrays.copyOfRange(arr,start,end + 1);
        System.out.println(Arrays.toString(ans));


        return maxSum;
    }

    static int subArray2(int arr []){

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
                int sum = 0;
            for (int j = i; j <arr.length ; j++) {
                sum += arr[j];
                max = Math.max(max,sum);
            }

        }
        return max;
    }
}
