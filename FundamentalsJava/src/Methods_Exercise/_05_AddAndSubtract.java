package Methods_Exercise;

import java.util.Scanner;

public class _05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        int sum = sum(n1,n2);

        int subtract = subtract(sum,n3);

        System.out.println(subtract);

    }

    public static int sum(int num1, int num2){

        return num1 +num2;

    }

    public static int subtract(int sum, int num3){
        return sum-num3;
    }

}
