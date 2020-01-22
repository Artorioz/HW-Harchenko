package HW1;
import java.util.Scanner;
public class HW211 {
    public static  void main(String args []){
        Scanner in  = new Scanner(System.in);
        System.out.println("Найдём дискрименант и корни уравнения: ax^2+bx+c=0");
        System.out.println("d=b^2-4ac");
        System.out.print("Введите a:");
        int a = in.nextInt();
        System.out.print("Введите b:");
        int b = in.nextInt();
        System.out.print("Введите c:");
        int c = in.nextInt();
        int f = 2;
        int g = 0;
        int r = 0;
        double d = b*b-4*a*c;
        double[] x = new double [2];
        /*g = d % 2;
        r = d % 3;*/

        if(d > 0 /*&& g==0 && r==0*/ ){
            System.out.println("Дискрименант:"+d);
        /*g = d % 2;*
        if(g==0) {
         d = (int) Math.sqrt(d);
            System.out.println("Корень дискрименанта:"+d);
            x[0] = ((-b+d)/(2*a));
            x[1] = ((-b-d)/(2*a));
            System.out.println("x1:"+x[0]+"  " +
                    "x2:"+x[1]);}
        } else {
            if(d==0){
                x[0]=((-b)/(2*a));
                System.out.println("x:"+x[0]);
            } else {
                System.out.println("Точек пересечения нет");

            }*/
        d = (double) Math.sqrt(d);
            System.out.printf("Корень дискреминанта: %.2f %n", d);
            /*System.out.printf(String.valueOf(d));*/
        /*System.out.println("Корень дискрименанта:"+d);*/

            x[0] = ((-b+d)/(2*a));
            x[1] = ((-b-d)/(2*a));
           /* System.out.println("x1:"+x[0]+"  " +
                    "x2:"+x[1]);*/
            System.out.printf("X1= %.2f %n", x[0]);
            System.out.printf("X2= %.2f %n", x[1]);
        } else /*{
            if(d > 0 && ((g!=0 && r==0) || (g==0 && r!=0))){
                System.out.println("Слишком сложно!");
            } else */{
                if(d==0){
                    System.out.println("Дискрименант:"+d);
                    x[0] = -b/(2*a);
                    System.out.printf("X= %.2f %n", x[0]);
                    /*System.out.println("x:"+x[0]);*/
                } else {
                    System.out.println("Корней нет.");

                }
            }
        }

    }
/*}*/
