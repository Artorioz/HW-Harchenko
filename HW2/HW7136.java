package HW2;
import java.util.Scanner;
public class HW7136 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int vvod;
        int maxposl = 0;
        int max = 0;
        System.out.println("Для остановки введите не число");
        vvod = in.nextInt();
        int srav = vvod;
            do {
                vvod = in.nextInt();
                if (srav == vvod) {
                    maxposl++;
                } else {
                    maxposl = 0;
                }
                if (max < maxposl) {
                    max = maxposl;
                }
            } while (in.hasNextInt());
            System.out.print("Максимальное число идущих подряд чисел:" + max);
        }
    }
