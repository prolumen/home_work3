package home_work3;

public class ArrSum extends MyEnter {
    int [] arrInt = new int [10];
    float[] arrFloat = new float[10];
    int res = 0;
    ArrSum() {
        System.out.println("hello bro");
        int s = scan.nextInt();

        if (s == 1) {
            myArr(res, arrInt);
        } else if (s == 2) {
            myArr(arrFloat);
        } else System.out.println("Good buy!");
    }

    void myArr(int res, int arrInt[]){
        for (int i = 0; i<arrInt.length; i++ ){
            int r = rand.nextInt(21) -1;
            if (r == -1) r = 1;
            arrInt[i] = r;
            res += arrInt[i];
        }
        System.out.println("\nсреднеарифметическое = " + res);

    }
    void myArr(float arrFloat[]){
        float res = 0;
        for (int i = 0; i<arrFloat.length; i++ ){
            float r = rand.nextFloat()*10;
            if (r == -1) r = 1;
            arrFloat[i] = r;
            System.out.print(arrFloat[i] + "\t");
            res += arrFloat[i];
        }
        System.out.println("\nсреднеарифметическое = " + res/arrFloat.length);

    }

    public static void main(String[] args) {
        ArrSum a = new ArrSum();
    }
}
