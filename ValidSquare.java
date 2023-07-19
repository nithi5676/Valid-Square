package validSquare;

import java.util.Scanner;

public class ValidSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.print(check(number));
    }

    public static boolean check(int number) {
        for (int i = 1; i < number / 2; i++) {
            if (i * i == number) {
                return true;
            }

        }
        return false;
    }

}
