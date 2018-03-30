package home_work3;

public class MyPrintStars extends MyEnter{
    private MyPrintStars(){
        System.out.println("Введие кол-во звездочек для печати");
        int sc = scan.nextInt();
        starPrint(sc);
    }

    void starPrint(int sc){
        for (int i = 0; i< sc; i++) System.out.print("*");
    }

    public static void main(String[] args) {
        MyPrintStars msp = new MyPrintStars();
    }
}
