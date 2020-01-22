package HW1;
import java.util.Scanner;
public class HW16 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координату точки по прямой х:");
        float c = in.nextFloat();
        if(c>1){
            System.out.print("Расстояние до отрезка:"+(c-1));
        } else {
            if(c<0){
                System.out.print("Расстояние до отрезка:"+(-c));
            } else {
                if(c == 0 || c == 1 || (0<c && c<1)){
                    System.out.print("Расстояние до отрезка:"+0);
                } else {
                    System.out.print("?");
                }
            }
        }
       /* float a = (float) 0.0;
        float b = (float) 1.0;
        System.out.println("Введите координату по оси x");
        float c  = in.nextFloat();
        if(/*c>a && c>b) /*{
            System.out.println("Расстояние до отрезка: "+(c-1));
        } else {
          if(c<a/* && c<b/*{
              System.out.println("Расстояние до отрезка: "+ (c*(-1)));
          } else {
              if(c==a || c==b || (c>a && c<b)){
                  System.out.println("Расстояние до отрезка: "+0);
              } else{
                  System.out.println("Что за ...?");
              }
          }
        }*/


    }
}
