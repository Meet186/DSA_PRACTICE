public class towerOfHaloni {

    static int towerofHaloni(int n, int from, int to, int auxlary){
        if(n == 1){
            System.out.println("move disk" + n + "from rod" + from + "to rod" + to);
            return 1;
        }
        int count = towerofHaloni(n-1,from,auxlary,to);
        System.out.println("move disk" + n + "from rod" + from + "to rod" + to);
        count += 1;
        count += towerofHaloni(n-1,auxlary,to,from);
        return count;
    }

    public static void main(String[] args) {
        int n = 3;
        int ans = towerofHaloni(n,1,2,3);
        System.out.println(ans);
    }
}
