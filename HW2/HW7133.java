package HW2;
import java.util.Scanner;
public class HW7133 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double max = Double.MIN_VALUE;
        int colmax = 1;
        double vvod;
        System.out.println("Вводите числа, для остановки введите -0. ");
            do {
                vvod = in.nextDouble();
                if (vvod == max) {
                        max = vvod;
                        colmax++;
                    } else {
                        if (vvod > max) {
                            max = vvod;
                            colmax = 1;
                        }
                    }
            } while ( vvod != -0);
                System.out.print("Максимальное число:"+max+"\nКол-во максимальных:"+colmax);
    }
}