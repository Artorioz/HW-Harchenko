package HW1;

public class js {
    public static  void main(String ags[]){
        boolean b = true;
        for(int i = 1;i<21;i++){
            if(i==1){
                System.out.print("Число 1 - простое число");
            } if (i==2){
                System.out.print("Число 2 - простое число");
            } else {
                for(int j = 2;j<i;j++){
                    if(i%j==0){
                        b=false;}
                    } if(b=false){
                    System.out.println("Число:"+i+" непростое число");
                } else {
                    System.out.println("Число:"+i+" простое число");
                }
            }
        }
    }
}
