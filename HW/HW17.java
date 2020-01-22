package HW1;
import java.util.Scanner;
public class HW17 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] x = new int[20];
        int[] y = new int[20];
        x[1] = 2;
        x[2] = 3;
        x[3] = 5;
        /*int g = 1;*/
        int a = 6;
        int i = 4;
        int f = i;
        int r = 6;
        for(a = r; i<= x.length-1; i++){
                if ((r % 2 == 0 && r % 1 == 0) || (r % 3 == 0 && r % 1 == 0)) {
                    a = r;
                    r = r + 1;
                    i = i - 1;
                } else {
                   /* for(g = 1; g<=x.length-1; f++) {
                        g = g + 1;
                        f=f+1;
                        if(Math.sqrt(r)==y[f]) {
                            a = r;
                            r = r + 1;
                            i = i - 1;
                        }*/

                    x[i] = r;
                    y[i] = r;
                    r = r + 1;
                }


        }
        /*System.out.print("Введите номер простого n-ого числа:");
        i = in.nextInt();
        System.out.print("N-ое простое число:"+x[i]);*/
           /* i = 4;
            for(i=4;i<=x.length-1;i++){
                y[0] = x[3]^2;
                if(y[0] != x[i]){
                    x[i] = x[i++];
                    i=i-1;
                } else {
                    x[i] = x[i];
                    i++;
                    System.out.println("Простое число №"+i+" = "+x[i]);
                }
            }*/

        for(i = 1; i<=x.length-1;i++){
            System.out.println("Простое число №"+i+" = "+x[i]);
        }

        /*System.out.print("Введите размер массива:");
        int[] a = new int[in.nextInt()];
        /*int i = in.nextInt();*/
        /*int[] a = new int[in.nextInt()];
        int x = 0;
        int j = 0;
        System.out.println("Введите число в массиве");*/
        /*System.out.println(a.length);
        for(x = 0 ; a.length >x; x++){
            System.out.print("Ведите число в "+j+" массив:");
            a[x] = in.nextInt();
            j = j+1;
        }
        System.out.print("Введите номер массива:");
        int k = in.nextInt();
        if(k<a.length){
        System.out.print("Число в массиве:"+a[k]);
        } else {
            System.out.println("Числа нет, т.к. маленький массив.");
        }*/



    }
}
