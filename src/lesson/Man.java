package lesson;

public class Man {
    Man(){
        System.out.println(a + " " + b);
    }
    static int a = 3;
    static int b;
    static void method(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    {
        System.out.println("block initialized");
    }

    static {
        System.out.println("static block initialized");
        b = a * 4;
    }

    public static void main(String args[]) {
        method(42);
        Man s = new Man();
    }
}

