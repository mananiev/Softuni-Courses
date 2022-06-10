package DataTypesAndVariables;

import java.util.Scanner;

public class _08_LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char input = scanner.nextLine().charAt(0);

        if (input > 96) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }

    }
}
