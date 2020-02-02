package HW2;
import java.util.Scanner;
public class HW7139 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int vvod;
        int kolvo = 1;
        int ost;
        System.out.println("Для завершения введите не число");
        vvod= in.nextInt();
        ost = vvod;
        do{
            vvod = in.nextInt();
            if(vvod>ost){
                ost=vvod;
                kolvo++;
            } else{
            ost=vvod;
            }
        } while (in.hasNextInt());
        System.out.println("Число элементов больших предыдущих:"+kolvo);
    }
}
