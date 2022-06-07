package BasicSyntaxCondLoops_Exercise;

import java.util.Scanner;

public class _02_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean non = false;

        int divisableBy = 0;

        if (number % 10 == 0 ) {
            divisableBy = 10;

        } else if (number % 7 == 0 ) {
            divisableBy = 7;

        } else if (number % 6 == 0 ) {
            divisableBy = 6;

        } else if (number % 3 == 0 ) {
            divisableBy = 3;

        } else if (number % 2 == 0 ) {
            divisableBy = 2;

        } else {
            non = true;
        }
            if (non) {
                System.out.println("Not divisible");
                } else {

                System.out.printf("The number is divisible by %d", divisableBy);

}
    }
}
