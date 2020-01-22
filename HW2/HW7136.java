package HW2;
import java.util.Scanner;
public class HW7136 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double vvod;
        int maxposl = 0;
        int max = 0;
        System.out.println("Для остановки введите 0,5");
        vvod = in.nextDouble();
        double srav = vvod;
        if (vvod != 0.5) {
            do {
                vvod = in.nextDouble();
                if (srav == vvod) {
                    maxposl++;
                } else {
                    maxposl = 0;
                }
                if (max < maxposl) {
                    max = maxposl;
                }
            } while (vvod != 0.5);
            System.out.print("Максимальное число идущих подряд чисел:" + max);
        } else {
            System.out.print("Максимальное число идущих подряд чисел:" + max);
        }
    }
}
