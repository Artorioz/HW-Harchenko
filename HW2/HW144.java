package HW2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HW144 {
    private static WorkWithNumbers workWithNumbers = new WorkWithNumbers();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inputInt();
        System.out.println("Kolvo vhod frag 1, 2, 3, 4, 5, 6: " + workWithNumbers.getQuantityOccurrencesFragment());
    }

    private static void inputInt() {
        System.out.println("Int-true / other false : ");
        try {
            while (true) {
                int number = scanner.nextInt();
                workWithNumbers.findQuantityOccurrencesFragment(number);
            }
        } catch (InputMismatchException e) {
            System.out.println("End!");
        }
    }
}