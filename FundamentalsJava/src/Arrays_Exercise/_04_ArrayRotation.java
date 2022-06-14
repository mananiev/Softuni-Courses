package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < rotations ; i++) {
            int temp = numArr[0];

            for (int j = 1; j < numArr.length; j++) {
                numArr[j-1] = numArr[j];

            }
            numArr[numArr.length-1] = temp;

        }

        for (int num: numArr) {
            System.out.print(num + " ");

        }
    }
}
