package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        boolean identical = true;
        for (int i = 0; i < firstArray.length; i++) {

            if (firstArray[i] != secondArr[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                identical = false;
                break;
            } else {
                sum += firstArray[i];

            }

        }

        if (identical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}
