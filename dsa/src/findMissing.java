public class findMissing {
    public static void main(String[] args) {

    }
    static int findMissingEl(int arr []){
        int n = arr.length + 1;
        int expctedsum = (n * (n+1))/2;
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            sum += arr[i];
        }
        return expctedsum - sum;
    }

    static void printMissingNum(int arr []){
        int i = 1;
        while (i < arr.length){
            if(arr[i] - arr[i-1] == 1){
                continue;
            } else {
                System.out.print(arr[i-1] + 1 + " ");
            }
            i++;
        }

    }

}
