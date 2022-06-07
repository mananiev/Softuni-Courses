package BasicSyntaxCondLoops_Exercise;

import java.util.Scanner;

public class _06_StrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sumOfFactorials = 0;

        int number2 = number;

        while (number2 != 0) {
            int lastDigit = number2 % 10;
            int fact = 1;

            for (int i = 1; i <= lastDigit ; i++) {
                fact *= i;

            }

            sumOfFactorials += fact;

            number2 = number2 /10;
        }



        if (number == sumOfFactorials){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
