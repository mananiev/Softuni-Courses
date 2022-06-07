package BasicSyntaxCondLoops_Exercise;

import java.util.Scanner;

public class _09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double total = 0;
        double total2 = 0;

        for (int i = 1; i <= orders ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            total = ((daysInMonth * capsulesCount) * pricePerCapsule);
            total2 += total;
            System.out.printf("The price for the coffee is: $%.2f %n", total);

        }

        System.out.printf("Total: $%.2f", total2);


    }
}
