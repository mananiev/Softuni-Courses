package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstN = Integer.parseInt(scanner.nextLine());
        int secondN = Integer.parseInt(scanner.nextLine());
        int thirdN = Integer.parseInt(scanner.nextLine());
        int fourthN = Integer.parseInt(scanner.nextLine());

        int result = ((firstN + secondN) / thirdN) * fourthN;

        System.out.println(result);
    }
}
