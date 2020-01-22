package HW1;
import java.util.Scanner;
public class HW27 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a:");
        int a = in.nextInt();
        System.out.print("Введите число b:");
        int b = in.nextInt();
        b = a + b;
        a = b - a;
        b = b - (a);
         System.out.println("Числа a:"+a+" и b: "+b);
    }
}
