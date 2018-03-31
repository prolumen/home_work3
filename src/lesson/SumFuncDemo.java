package lesson;

import java.util.Scanner;

public class SumFuncDemo {
    static void SumDemo(int k){
        int a, b, c;
        c = k%10;
        b = ((k%100) - c)/10;
        a = (k-(k%100))/100;

        System.out.println(a+" "+b+" "+c);

    }
    public static void main(String[] args) {
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        SumDemo(k);
    }
}
