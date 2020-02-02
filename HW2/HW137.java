package HW2;
import java.util.Scanner;
public class HW137 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vvod;
        int dlina = 0;
        int First = Integer.MIN_VALUE;
        int Final = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        do {
            dlina++;
            System.out.print("Vvedite chislo:");
            vvod = in.nextInt();
            if (vvod > max) {
                max = vvod;
                First = dlina;
                Final = dlina;
            }
            if (vvod == max) {
                Final = dlina;
            }
        } while (in.hasNextInt());
        if (max != Integer.MIN_VALUE) {
            System.out.println("Max chislo:" + max);
            System.out.println("Pervoe poyvlrnie:" + First);
            System.out.println("Poslednee poyvlenie:" + Final);
        } else {
            System.out.println("Завершение.");
        }
    }
}
