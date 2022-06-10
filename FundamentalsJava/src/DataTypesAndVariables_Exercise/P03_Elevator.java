package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());


        double result = Math.ceil((double)numberOfPeople/capacity);

        System.out.printf("%.0f", result);
    }
}
