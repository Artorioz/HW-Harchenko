package HW1;
import java.util.Scanner;
public class HW15 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int a = in.nextInt();
        System.out.print("Введите второе число:");
        int b = in.nextInt();
        System.out.print("Введите третье число:");
        int c = in.nextInt();
        if((a>b && a>c) || (b>a && b>c)||(c>a && c>b)){
            System.out.println("Кол-во наибольших чисел: "+1);
        } else {
            if((b>c && a==b) || (a>b && c==a) || (c>a && b==c)){
                System.out.println("Кол-во наибольших чисел: "+2);
            } else {
                if(c==a && c==b && a==b){
                    System.out.println("Кол-во наибольших чисел: "+3);
                } else{
                    System.out.println("Таких нет");
                }
            }
        }

    }
}
