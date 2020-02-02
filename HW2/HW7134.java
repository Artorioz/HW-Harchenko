package HW2;
import java.util.Scanner;
import java.util.InputMismatchException;
public class HW7134 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int vvod;
        int kva;
        System.out.println("Число для выхода введите не числа.");
        System.out.print("Введите число:");
        vvod = in.nextInt();
        if (in.hasNextInt()){
            kva = vvod*vvod;
            System.out.println("Квадрат введённого числа:"+kva);
            do {
                System.out.print("Введите число:");
                vvod = in.nextInt();
                    kva = vvod*vvod;
                    System.out.println("Квадрат введённого числа:"+kva);
            } while (in.hasNextInt());
            System.out.println("Спасибо за использование!");
        } else {
            System.out.println("Прощай");
        }
    }
}
