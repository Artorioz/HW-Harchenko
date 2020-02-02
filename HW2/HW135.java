package HW2;
import java.util.Scanner;
import java.util.InputMismatchException;
public class HW135 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double vvod = Double.MIN_VALUE;
        int kol = 0;
        double sum = 0;
        double aref = Double.MIN_VALUE;
        System.out.println("Число для выхода введите , что угодно кроме числа.");
        System.out.print("Введите число:");
        vvod=in.nextDouble();
            do {
                System.out.print("Введите число:");
                vvod = in.nextDouble();
                sum = sum + vvod;
                kol++;
            } while (in.hasNextDouble());
            aref = sum / kol;
            System.out.print("Среднее арифметическое:" + aref);
        if(kol==0){
            System.out.println("Пока!");
        }
    }
}
