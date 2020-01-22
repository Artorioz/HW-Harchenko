package HW1;
import java.util.Scanner;
public class HW29 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.println("Введите координату точки на оси");
        int c = in.nextInt();
        if(c>a && c>b){
            c = c-b;
            System.out.println("Расстояние до отрезка: "+c);
        } else {
            if(c<a && c<b){
                c = c*-1;
                System.out.println("Расстояние до отрезка: "+c);
            } else {
                if(c>a && c<b){
                    c=0;
                    System.out.println("Расстояние до отрезка: "+c);
                }
            }
        }
    }
}
