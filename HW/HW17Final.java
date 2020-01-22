package HW1;
import  java.util.Scanner;
public class HW17Final {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер простого числа:");
        int i = in.nextInt();
        if (i >= 1) {
            int[] x = new int[i + 1];
            x[1] = 2;
            i = 2;
            int q = 0;
            int r = 3;
            int g = 1;
            int f = 0;
            for (x[1] = 2; i < x.length; i++) {
                while (g < i) {
                    if (r % x[g] != 0) {
                        g++;
                    } else {
                        g++;
                        f++;
                    }
                }
                if (f > 0) {
                    r++;
                    g = 1;
                    i--;
                    f = 0;
                } else {
                    x[i] = r;
                    r++;
                    g = 1;
                    f = 0;
                }
            }
            System.out.print("Выберите \nВывод только номерного простого числа 1\nВывод всех простых чисел перед номерным простым числом вместе с ним 2\nВыбирай:");
            q = in.nextInt();
            if(q==2||q==1) {
                switch (q) {
                    case 1:
                        q = 1;
                        i = x.length - 1;
                        System.out.print("№ " + i + " простое число:" + x[i]);
                        break;
                    case 2:
                        q = 2;
                        i = 1;
                        for (x[1] = 2; i < x.length; i++) {
                            System.out.println("Простое число № " + i + " : " + x[i]);
                        }
                    }
                } else {
                System.out.print("Ты не человек");
            }
        } else {
            System.out.print("Перезапускай");
        }
    }
}
