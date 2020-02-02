package HW2;
import java.util.Scanner;
public class HW7138 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int kolvovsego=1;
        int nomernulay=0;
        int vvod;
        System.out.println("Для завершения введите букву");
        do{
            vvod = in.nextInt();
            if(vvod!=0){
                kolvovsego++;
            } else {
                if(vvod==0 && nomernulay==0){
                    nomernulay=kolvovsego;
                    kolvovsego++;
                }
            }
        } while(in.hasNextInt());
        if(nomernulay!=0) {
            System.out.print("Номер первого нуля в последовательности:"+nomernulay);
        } else {
            System.out.print("Null");
        }
    }
}
