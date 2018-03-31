package home_work3;

public class CheckNum extends MyEnter {
    CheckNum() {
        System.out.println("Введите трехзначное число:");
        int n = scan.nextInt();
        int a, b, c;
        c = n % 10;
        b = ((n % 100) - c) / 10;
        a = (n - (n % 100)) / 100;
        System.out.println("Определить четная ли сумма цифр числа - ввести 1\nОпределить возрастание цифр в числе - введите 2\n");
        String str = scan.next();
        str.toString();

        if (str.equals("1")){
            if (EvenOdd(a,b,c)) {
                System.out.println("Четное");
            } else System.out.println("Не четное");
        } else if (str.equals("2")){
            if (Increase(a,b,c)) {
                System.out.println("Возрастающее");
            } else System.out.println("Не возрастающее");
        } else System.out.println("Good buy!!!");
            System.out.println("Завершение программы ");
        }

    boolean EvenOdd(int a, int b, int c){
        int res = (a + b + c)%2;
        if (res == 0){
            return true;
        } else return false;
    }
    boolean Increase(int a, int b, int c){
        if ((a<b)||(b<c)){
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        CheckNum checkNum = new CheckNum();
    }
}
