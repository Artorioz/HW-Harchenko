package HW2;
import java.util.Scanner;
public class HW7142 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double vvod = Double.MIN_VALUE;
        double prov = Double.MIN_VALUE;
        int max = 0;
        int provmax = 0;
        System.out.println("Для выхода введите: 0,5");
        do {
            System.out.print("Введите число:");
            vvod = in.nextDouble();
                if (vvod != prov) {
                    provmax = 1;
                } else {
                    if (vvod == prov) {
                        provmax++;
                    }
                }

            if (provmax > max) {
                max = provmax;
            }
            prov = vvod;
        } while (vvod != 0.5);
        System.out.println("Max:"+max);
    }
}