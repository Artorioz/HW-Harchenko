package HW2;
import java.util.Scanner;
public class HW7133 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double max = Double.MIN_VALUE;
        int colmax = 1;
        double vvod;
        System.out.println("Вводите целые числа");
            do {
                System.out.println("Для остановки введите:"+0.5+"\n"+"Введённое число:");
                vvod = in.nextInt();
                if (vvod == max) {
                        colmax++;
                    } else {
                        if (vvod > max) {
                            max = vvod;
                            colmax = 1;
                        }
                    }
            } while ( vvod != 0.5);
                System.out.print("Максимальное число:"+max+"\nКол-во максимальных:"+colmax);
    }
}