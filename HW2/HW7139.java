package HW2;
import java.util.Scanner;
public class HW7139 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double vvod;
        int kolvo = 1;
        double ost;
        System.out.println("Для завершения введите 0,5");
        vvod= in.nextDouble();
        ost = vvod;
        do{
            vvod = in.nextDouble();
            if(vvod>ost){
                ost=vvod;
                kolvo++;
            } else{
            ost=vvod;
            }
        } while (vvod!=0.5);
        System.out.println("Число элементов больших предыдущих:"+kolvo);
    }
}
