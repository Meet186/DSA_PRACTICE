public class minMovetoMoveDisk {
    public static void main(String[] args) {
        int ans = minMove(5,1,2,3);
        System.out.println(ans);
    }
    static int minMove(int n , int from , int to , int auxlary){
        if(n == 1){
            System.out.println(" Move Disk" + n + "form rod" + from + "to rod" + to );
            return 1;
        }
        int count = minMove(n-1,from,auxlary,to);
        System.out.println(" Move Disk" + n + "form rod" + from + "to rod" + to );
        count += 1;
        count += minMove(n-1,auxlary,to,from);
        return count;
    }
}
