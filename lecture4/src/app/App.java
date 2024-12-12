package app;

import javax.xml.namespace.QName;

public class App {
   public String str = "i am from pakage ";
    public String  Welcome(){
       String ans =  ("WELCOME!");
        return ans;
    }

    public static void main(String[] args) {
        App obj = new App();
        obj.Welcome();
        System.out.println(obj.str);
        App2 obj2 = new App2();
        obj2.welcometea();
    }

}

class App2{
    App obj  = new App();
    void welcometea(){
//        System.out.println("Take a tea from  class App2 : " + obj.str);
    }

    public static void main(String[] args) {

    }
}

class App3 {
   public String welcomeCofee(String name){

       String a = "le cofee" + name;
       return a;

   }
}