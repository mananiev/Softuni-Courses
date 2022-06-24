package Methods_Exercise;

import java.util.Scanner;

public class _03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        printCharactersInBetween(start, end);

    }

    public static void printCharactersInBetween(char start, char end) {

        if (end < start) {
            for (int i = end + 1; i <= start - 1; i++) {
                System.out.print((char) i + " ");

            }
        } else {

            for (int i = start + 1; i <= end - 1; i++) {
                System.out.print((char) i + " ");

            }
        }

    }
}
