package HW2;
import java.util.Scanner;
public class HW7138 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int kolvovsego=1;
        int nomernulay=0;
        double vvod;
        System.out.println("Для завершения введите 0,5");
        do{
            vvod = in.nextDouble();
            if(vvod!=0){
                kolvovsego++;
            } else {
                if(vvod==0 && nomernulay==0){
                    nomernulay=kolvovsego;
                    kolvovsego++;
                }
            }
        } while(vvod!=0.5);
        if(nomernulay!=0) {
            System.out.print("Номер первого нуля в последовательности:"+nomernulay);
        } else {
            System.out.print("Null");
        }
    }
}
