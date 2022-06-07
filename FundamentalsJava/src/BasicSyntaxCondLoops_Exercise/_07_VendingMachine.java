package BasicSyntaxCondLoops_Exercise;

import java.util.Objects;
import java.util.Scanner;

public class _07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double priceOfItem = 0;
        double availableMoney = 0;

        String input = scanner.nextLine();

        while (!Objects.equals(input, "Start")) {
            double money = Double.parseDouble(input);

            if (money == 0.1 || money == 0.2 || money ==  0.5 || money ==  1 || money == 2) {

                availableMoney += money;
            } else {
                System.out.printf("Cannot accept %.2f", money);
                System.out.println();
            }

            input = scanner.nextLine();
        }

        String input2 = "";


        while (!input2.equals("End")) {

            input2 = scanner.nextLine();

            if (input2.equals("End")){
                break;
            }

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
                    continue;


            }

            if (availableMoney < priceOfItem) {
                System.out.println("Sorry, not enough money");
            } else if (availableMoney>= priceOfItem){
                availableMoney -= priceOfItem;
                System.out.printf("Purchased %s %n", input2);
            }



        }

        System.out.printf("Change: %.2f", availableMoney );

    }
}
