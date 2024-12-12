public class binarySerchOnAnsValue {
    public static void main(String[] args) {
        int arr [] = {12,10,3,5};
        int m = 3;
        int ans = distrubuteChoclate(arr,m);
        System.out.println(ans);

    }

    // Distrubute Choclate..

    static boolean isDivisionPosible(int arr [], int m, int maxChoclate){
        int numberOfStudents = 1;
        int choclate = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxChoclate) return false;
            if(choclate + arr[i] <= maxChoclate){
                choclate += arr[i];
            } else
            {
                numberOfStudents++;
                choclate = arr[i];
            }
        }
        if(numberOfStudents > m) return false;
        return true;

    }

    static int distrubuteChoclate(int arr [],int m){
        if(arr.length < m) return -1;
        int si = 1, ei = (int) 1e9;
        int ans = 0;
        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(isDivisionPosible(arr,m,mid)){
                ans = mid;
                ei = mid-1;
            } else {
                si = mid + 1;
            }
        }
        return ans;
    }

}
