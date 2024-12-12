public class primeCount {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 10; i++) {
            if(primeCount(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean primeCount(int n){
        int count = 0;
        if(n <= 1){
            return false ;
        }
       if(n > 2 && n%2 == 0) return false;

        for (int i = 3; i < Math.sqrt(n) ; i += 2) {
            if(n % i == 0){
                return false;
            }
        }
        return true;

    }



}
