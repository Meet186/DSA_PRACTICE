public class interningAndnew {
    public static void main(String[] args) {
        String s = "hello";
        String t = "hello";
        String u = new String("hello");
        // String  s & t point to the same address.
        // Sring u will point different address.
        System.out.println(s == t); // true
        System.out.println(s == u); // false {because different address}
        System.out.println(s.equals(u)); // true {becaue same character && different address}
    }
}
