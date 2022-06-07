package BasicSyntaxCondLoops_Exercise;

import java.util.Scanner;

public class _07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double priceOfItem = 0;
        double Nuts = 2;
        double Water = 0.7;
        double Crisps = 1.5;
        double Soda = 0.8;
        double Coke = 1;
        double availableMoney = 0;

        String input = scanner.nextLine();

        while (input != "Start") {
            double money = Integer.parseInt(input);

            if (money == 0.1 || money == 0.2 || money ==  0.5 || money ==  1 || money == 2) {

                availableMoney += money;
            } else {
                System.out.printf("Cannot accept %.2f", money);
            }

            input = scanner.nextLine();
        }

        String input2 = scanner.nextLine();

        while (input2 != "End") {

            switch (input2) {

                case "Nuts":
                     priceOfItem = 2;
                    break;
                case "Water":
                    priceOfItem = 0.7;
                    break;
                case "Crisps":
                    priceOfItem = 1.5;
                    break;
                case "Soda":
                    priceOfItem = 0.8;
                    break;
                case "Coke":
                    priceOfItem = 1;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;

            }

            if (availableMoney < priceOfItem) {
                System.out.println("Sorry, not enough money");
            } else {
                availableMoney -= priceOfItem;
                System.out.printf("Purchased %s", input2);
            }


        }

        System.out.printf("Change: %.2f", availableMoney );

    }
}
