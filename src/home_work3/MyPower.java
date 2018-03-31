package home_work3;

public class MyPower extends MyEnter{
    MyPower(){
        int a, b;
        System.out.println("Введите число: ");
        a = scan.nextInt();
        System.out.println("Введите степень: ");
        b = scan.nextInt();
        if (b != 1){
            pow(a, b);
        } else if (b == 1){
            pow(a);
        }


    }
    void pow(int a, int b){
        System.out.println("resault = " + Math.pow(a, b));
    }
    void pow (int a){
        System.out.println("resault = " + Math.pow(a, 1));
    }

    public static void main(String[] args) {
        MyPower mp = new MyPower();
    }
}
