package HW1;
import java.util.Scanner;
public class HW28 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        System.out.println("Введите третье число");
        int c = in.nextInt();
        if(a>b && a<c || a<b && a>c){
            System.out.println("Второе по величене число: "+a);
        } else {
            if(b>a && b<c || b<a && b>c) {
                System.out.println("Второе по величене число: "+b);
            }else {
                if(c>a && c<b || c<a && c>b){
                    System.out.println("Второе по величене число: "+c);
                } else {
                    if(a==b && a>c){
                        System.out.println("Второе по величене число: "+c);
                    } else {
                        if(a==b && a<c){
                            System.out.println("Второе по величене число: "+a);
                        } else{
                            if(b==c && c>a){
                                System.out.println("Второе по величене число: "+a);
                            } else{
                                if(b==c && c<a){
                                    System.out.println("Второе по величене число: "+c);
                                } else {
                                    if(a==c && a>b){
                                        System.out.println("Второе по величене число: "+b);
                                    } else {
                                        if(a==c && a<b){
                                            System.out.println("Второе по величене число: "+a);
                                        } else {
                                            System.out.println("Такого нет");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }

        }
    }
}
