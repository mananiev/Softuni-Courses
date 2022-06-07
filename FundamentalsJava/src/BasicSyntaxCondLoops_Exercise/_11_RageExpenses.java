package BasicSyntaxCondLoops_Exercise;

import java.util.Scanner;

public class _11_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLost = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double monitorPrice = Double.parseDouble(scanner.nextLine());

        double rageCost = (countLost / 2 * headsetPrice) + (countLost / 3 * mousePrice) + (countLost / 6 * keyboardPrice) + (countLost / 12 * monitorPrice);

        System.out.printf("Rage expenses: %.2f lv.", rageCost);
    }
}
