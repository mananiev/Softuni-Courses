package DataTypesAndVariables;

import java.util.Scanner;

public class _06_CharsToStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String empty = "";

        char one = scanner.nextLine().charAt(0);
        char two = scanner.nextLine().charAt(0);
        char three = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c", one, two, three);
    }
}
