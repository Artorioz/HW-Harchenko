package HW2;
import java.util.Scanner;
public class HW140 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int vvod = 0;
        System.out.println("Для выхода введите не число");
        do {
            System.out.print("Введите:");
            vvod = in.nextInt();
            if (vvod > max) {
                max2 = max;
                max = vvod;
            } else {
                if (vvod < max && vvod > max2) {
                    max2 = vvod;
                }
            }

        } while (in.hasNextInt());
        if(max2==Double.MIN_VALUE || max2==0.5){
            System.out.println("No");
        } else {
            if(max2!=Double.MIN_VALUE && in.hasNextInt()){
                System.out.println("Max2:" + max2);
            }
        }
    }
}



