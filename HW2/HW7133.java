package HW2;
import java.util.Scanner;
public class HW7133 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int colmax = 1;
        int vvod;
        System.out.println("Вводите целые числа");
            do {
                System.out.print("Введённое число:");
                vvod = in.nextInt();
                if (vvod == max) {
                        colmax++;
                    } else {
                        if (vvod > max) {
                            max = vvod;
                            colmax = 1;
                        }
                    }
            } while (in.hasNextDouble());
            if(max!=Integer.MIN_VALUE) {
                System.out.print("Максимальное число:" + max + "\nКол-во максимальных:" + colmax);
            }
    }
}