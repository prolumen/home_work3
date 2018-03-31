package home_work3;

public class MaxCommonFactor  extends MyEnter{
    int a;
    int b;
    MaxCommonFactor(){
        this.a = a;
        this.b = b;
        System.out.println("enter a");
        a = scan.nextInt();
        System.out.println("enter b");
        b = scan.nextInt();
        mcf(a, b);
    }
    void mcf(int a, int b){
        while ((a != 0)&&(b != 0)){
            if (a > b) a = a%b;
            else b = b%a;
        }
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        MaxCommonFactor mf = new MaxCommonFactor();

    }
}
