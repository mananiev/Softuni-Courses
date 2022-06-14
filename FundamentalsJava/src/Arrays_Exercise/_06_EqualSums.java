package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer:: parseInt)
                .toArray();

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < numArr.length; i++) {

            for (int j = i-1; j <= i  ; j++) {
                sumLeft += numArr[j];

            }

            for (int k = i +1 ; k < numArr.length ; k++) {
                sumRight += numArr[k];

            }

            if (sumLeft == sumRight ){
                System.out.println(i);
            }

        }
    }
}
