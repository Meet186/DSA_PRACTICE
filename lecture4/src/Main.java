import app.App;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        App obj = new App();
        System.out.println(obj.str);
        System.out.println( obj.Welcome());
        App3 onj3 = new App3();
        onj3.main();

    }
}

class App3 extends App{
    void main () {
        App obj = new App();
        System.out.println("extends" + obj.str + obj.Welcome());

    }




}
