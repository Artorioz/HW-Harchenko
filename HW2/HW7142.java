package HW2;
import java.util.Scanner;
public class HW7142 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vvod = Integer.MIN_VALUE;
        int prov = Integer.MIN_VALUE;
        int max = 0;
        int provmax = 0;
        System.out.println("Для выхода введите: 0,5");
        do {
            System.out.print("Введите число:");
            vvod = in.nextInt();
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
        } while (in.hasNextInt());
        System.out.println("Max:"+max);
    }
}