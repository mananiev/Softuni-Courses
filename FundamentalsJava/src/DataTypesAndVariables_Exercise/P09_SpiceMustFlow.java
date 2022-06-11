package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalYield =0;


        while (startingYield >= 100 ) {

            totalYield +=startingYield -26;

            days++;
            startingYield -=10;
        }

        totalYield -= 26;
        if (totalYield < 0){
            totalYield = 0;
        }

        System.out.println(days);
        System.out.println(totalYield);
    }
}
