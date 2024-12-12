public class operators {
    public static void main(String[] args) {
        int p = 5 , q = 10, r = 5;


        System.out.println(p == q); //false
        System.out.println(p > q);  //false
        System.out.println(p != q); //true
        System.out.println(p < q);  //true
        System.out.println(p >= q); //false
        System.out.println(p <= q); // true
        System.out.println(p == q && p == r); // false
        System.out.println(p == q || p == r); // true
        System.out.println(++p); //6
        System.out.println(p++); //6
        p += q;
        System.out.println(p); //17



    }
}
