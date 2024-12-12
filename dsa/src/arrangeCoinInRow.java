public class arrangeCoinInRow {
    public static void main(String[] args) {

    }
    static int finndCoinRow(int n){
        // TC - O(N)
        int count = 1;

        while (n > 0){
            n = n-count;

            if(n < 0){
                break;
            }
            count++;

        }
        return count - 1;
    }
}
