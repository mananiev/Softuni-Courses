package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Multiplicationv2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int toNum = Integer.parseInt(scanner.nextLine());

        if (toNum < 10){

        for (int i = toNum; i <= 10 ; i++) {
            int sum = a * i;
            System.out.printf("%d X %d = %d", a, i, sum);
            System.out.println();
        }

            } else {
            int newSum = a * toNum;
            System.out.printf("%d X %d = %d", a, toNum, newSum);

        }
    }
}
