package HW1;

import HW1.Xterm;

public class XT {
    public static void main(String args[]) throws Exception{
        Xterm.print("Введите первое число:",Xterm.White);
        int a = Xterm.inputInt();
        Xterm.print("Ведите второе число:",Xterm.Blue);
        int b = Xterm.inputInt();
        Xterm.print("Введите третье число:",Xterm.Red);
        int c = Xterm.inputInt();
        int d = (a+b+c)/3;
        Xterm.print("Введённые числа:"+a+";"+b+";"+c+".\n",Xterm.Green,Xterm.Blue);
        Xterm.print("Среденее Арифметическое:"+d,Xterm.Magenta,Xterm.Yellow);
    }
}
