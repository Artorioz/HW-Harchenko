package HW2;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        inputNumbers();
    }

    private static void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (scanner.hasNextInt()) {
            number = scanner.nextInt();
        }
    }
}
