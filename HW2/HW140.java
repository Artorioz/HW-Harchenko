package HW2;
import java.util.Scanner;
public class HW140 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double max = Double.MIN_VALUE;
        double max2 = Double.MIN_VALUE;
        double vvod = 0;
        System.out.println("0,5=end");
        do {
            System.out.print("Vvedite chislo:");
            vvod = in.nextDouble();
            if (vvod > max) {
                max2 = max;
                max = vvod;
            } else {
                if (vvod < max && vvod > max2) {
                    max2 = vvod;
                }
            }

        } while (vvod != 0.5);
        if(max2==Double.MIN_VALUE || max2==0.5){
            System.out.println("No");
        } else {
            if(max2!=Double.MIN_VALUE && max2!=0.5){
                System.out.println("Max2:" + max2);
            }
        }
    }
}



