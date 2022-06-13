package Arrays;

import java.util.Scanner;

public class _05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        int[] numArr = new int[arr.length];

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < arr.length; i++) {

            numArr[i] = Integer.parseInt(arr[i]);

            if (numArr[i] % 2 == 0) {
                sumEven += numArr[i];

            } else {
                sumOdd += numArr[i];
            }

        }


        System.out.println(sumEven - sumOdd);
    }
}
