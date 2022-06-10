package DataTypesAndVariables;

import java.util.Scanner;

public class _12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 0;
        boolean condition = false;

        for (int i = 1; i <= n; i++) {
            num = i;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            condition = (sum ==  5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", i, condition);

        }

    }
}
