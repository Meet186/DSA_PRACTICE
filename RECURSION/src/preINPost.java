public class preINPost {

    static void zigZag(int n){
        if(n == 0) return;
        System.out.print(n);
        zigZag(n-1);
        System.out.print(n);
        zigZag(n-1);
        System.out.print(n);
        return;

    }

    public static void main(String[] args) {
        zigZag(2);
    }
}
