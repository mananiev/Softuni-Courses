package Methods_Exercise;

import java.util.Scanner;

public class _10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {

            if (sumIsDivisibleBy8(i) && atLeastOneOdd(i)){
                System.out.println(i);
            }
        }


    }

    public static boolean sumIsDivisibleBy8(int n) {

        int sum = 0;

        while (n > 0) {

            sum = sum + (n % 10);
            n /= 10;
        }

        return sum % 8 == 0;
    }

    public static boolean atLeastOneOdd(int n) {

        int count = 0;

        while (n > 0) {
            int lastDigit = n % 10;

            if (lastDigit % 2 ==1){
                return true;
            }
            n /= 10;
        }

        return false;
    }
}
