//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Test{

    public void a() throws ArithmeticException{}
        System.out.println("a");
        b();
    }
    public void b() throws ArithmeticException{
        System.out.println("b");
        int n = 10;
        int result = n/0;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("start");
        Test t = new Test();
        try{
            t.a();
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("end");

    }
}