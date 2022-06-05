package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class TheaterPromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticketPrice = 0;

        if (age>=0 && age<=18){
            switch (day) {
                case "Weekday" -> ticketPrice = 12;
                case "Weekend" -> ticketPrice = 15;
                case "Holiday" -> ticketPrice = 5;
            }
            System.out.printf("%d$",ticketPrice);

        } else if (age>18 && age<=64) {
            ticketPrice = switch (day) {
                case "Weekday" -> 18;
                case "Weekend" -> 20;
                case "Holiday" -> 12;
                default -> ticketPrice;
            };
            System.out.printf("%d$",ticketPrice);

        } else if (age>64 && age<=122) {
            ticketPrice = switch (day) {
                case "Weekday" -> 12;
                case "Weekend" -> 15;
                case "Holiday" -> 10;
                default -> ticketPrice;
            };
            System.out.printf("%d$",ticketPrice);

        } else {
            System.out.println("Error!");
        }
    }
}
