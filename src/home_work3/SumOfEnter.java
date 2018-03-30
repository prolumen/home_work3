package home_work3;


public class SumOfEnter extends MyEnter{
    SumOfEnter(){
        System.out.println("enter the right limit:");
        int sc = scan.nextInt();
        System.out.print("\nres\t");
        sum(sc);
    }
     void sum(int sc){
        int res = 0;
        for (int i = 1; i<= sc; i++){
            res += i;
        }
        System.out.print(res);
    }

    public static void main(String[] args) {
        SumOfEnter s = new SumOfEnter();
    }
}
