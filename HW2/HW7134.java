package HW2;
import java.util.Scanner;
import java.util.InputMismatchException;
public class HW7134 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int vvod;
        int kva = -1;
        System.out.println("Число для выхода введите не числа.");
        System.out.print("Введите число:");
        vvod = in.nextInt();
            do {
                System.out.print("Введите число:");
                vvod = in.nextInt();
                    kva = vvod*vvod;
                    System.out.println("Квадрат введённого числа:"+kva);
            } while (in.hasNextInt());
            System.out.println("Спасибо за использование!");

        if(kva==-1) {
            System.out.println("Прощай");
        }
    }
}
