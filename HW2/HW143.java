package HW2;
import java.util.Scanner;
public class HW143 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int vvod = Integer.MIN_VALUE;
        int prov = Integer.MIN_VALUE;
        int del = 0;
        System.out.println("Для окончания введите что-то отличное от 0 и 1");
        do{
            System.out.print("Введите:");
            vvod = in.nextInt();
            if(vvod==1 && prov==0){
                del++;
            }
            prov = vvod;

        } while(vvod>=0 && vvod<=1 && in.hasNextInt());
        System.out.println("Del:"+del);
    }
}
