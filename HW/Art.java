package HW;

import java.util.Scanner;
public class Art {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = {3, 2, 5};
        b[1] = 100;

        System.out.println(b.length);

        System.out.println("########");
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        System.out.println("########");
        int i = 0;
        for(i = 0; i < b.length; i = i + 1){
            //System.out.println("qqqq");
            //System.out.println(i);
            b[i] = b[i] + 1;
            System.out.println(b[i]);
        }
        System.out.println(i);

        System.out.println("########");
        for(int j = 0; j < a.length; j = j + 1){

        }

        //https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html

        //int c = 3;
        //int d = 5;
        //c = d;
    }
}
