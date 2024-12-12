package friction;
public class Friction {
// ------ Class-Variable ----------------
    int num;
    int den;
//  ----------- Constructors-------------
    public Friction(){}
    public Friction(int num,int den){
        this.num = num;
        this.den = den;
    }
    // -------- Class-Methods------------
    public  void simpily(){
       int gcd = gcd(num,den);
       num /= gcd;
       den /= gcd;
    }
    private int gcd(int x,int y){
        if(y == 0) return x;
        return gcd(y,x%y);
    }

    public static Friction Add(Friction f1 , Friction f2){
        int numerator = f1.num * f2.den + f2.num * f1.den;
        int denometor = f1.den * f2.den;
        Friction f3 = new Friction(numerator,denometor);
        return f3;
    }

    public static Friction multiply(Friction f1 , Friction f2){
        int numerator = f1.num * f2.num;
        int denomerator = f1.den * f2.den;
        return new Friction(numerator,denomerator);
    }

    public static void getPrivateMethodsName(){
        System.out.println("gcd");
    }

    public static void overWriteSum(Friction f1 , Friction f2){
        int numerator = f1.num * f2.den + f2.num * f1.den;
        int denometor = f1.den * f2.den;
        f1.den = denometor;
        f1.num = numerator;
    }



    public void printFriction(){
        System.out.println(num + "/" + den);
    }



}
