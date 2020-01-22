package HW1;
import java.util.Scanner;
public class HW13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        System.out.println("ведите третье число");
        int c = in.nextInt();
        if (a == b || a == c || b == c)
        {
            System.out.println("Да");
        } else{
            System.out.println("Нет");

        }


        }
    }
