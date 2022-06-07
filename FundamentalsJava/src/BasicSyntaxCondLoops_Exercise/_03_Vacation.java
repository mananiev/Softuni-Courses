package BasicSyntaxCondLoops_Exercise;

import java.util.Objects;
import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double ticketPrice = 0;

        if (Objects.equals(groupType, "Students")) {
            switch (dayOfWeek){
                case "Friday":
                    ticketPrice = 8.45;
                    break;
                case "Saturday":
                    ticketPrice = 9.80;
                    break;
                case "Sunday":
                    ticketPrice = 10.46;
                    break;
            }
        } else if (Objects.equals(groupType, "Business")) {
            switch (dayOfWeek){
                case "Friday":
                    ticketPrice = 10.90;
                    break;
                case "Saturday":
                    ticketPrice = 15.60;
                    break;
                case "Sunday":
                    ticketPrice = 16;
                    break;
            }
        } else if (Objects.equals(groupType, "Regular")) {
            switch (dayOfWeek){
                case "Friday":
                    ticketPrice = 15;
                    break;
                case "Saturday":
                    ticketPrice = 20;
                    break;
                case "Sunday":
                    ticketPrice = 22.50;
                    break;
            }
        }

        double totalPrice = 0;

        if (Objects.equals(groupType, "Students")) {
            if (groupCount>=30){
                totalPrice = groupCount * ticketPrice *0.85;
            } else {
                totalPrice = groupCount * ticketPrice;
            }

        } else if (Objects.equals(groupType, "Business")) {
            if (groupCount>=100){
                totalPrice = (groupCount -10) * ticketPrice;
            } else {
                totalPrice = groupCount * ticketPrice;
            }

        } else if (Objects.equals(groupType, "Regular")) {
            if (groupCount>= 10 && groupCount<= 20){
                totalPrice = groupCount * ticketPrice *0.95;
            } else {
                totalPrice = groupCount * ticketPrice;
            }

        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
