package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P05_PrintPartOfAsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int from = Integer.parseInt(scanner.nextLine());
        int to = Integer.parseInt(scanner.nextLine());

        for (int i = from; i <= to ; i++) {
            System.out.print((char)i + " ");

        }
    }
}
