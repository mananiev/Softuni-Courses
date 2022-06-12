package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        int sum = 0;

        int[] numArr = Arrays
                .stream(inputLine.split( " "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numArr.length; i++) {

            if (numArr[i] %2 == 0) {

                sum += numArr[i];
            }


        }
        System.out.println(sum);
    }


}
