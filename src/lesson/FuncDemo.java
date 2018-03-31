package lesson;

import java.util.Scanner;

public class FuncDemo {
    int count ;
    FuncDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество звездочек");
        int count  = sc.nextInt();
        System.out.println();
        myPrint(count);
    }

    private void myPrint(int count){
        for (int i = 0; i<=count-1; i++){
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        FuncDemo f = new FuncDemo();
    }
}
