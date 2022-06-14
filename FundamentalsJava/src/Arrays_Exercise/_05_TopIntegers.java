package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();



        boolean isTop = false;

        for (int i = 0; i <= numArr.length -1; i++) {
            int currentNum = numArr[i];

            if (i == numArr.length - 1) {
                System.out.print(currentNum + " ");
                continue;

            }

            for (int j = i+1; j <= numArr.length -1; j++) {



                if (currentNum > numArr[j]) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }

            }

            if (isTop){

                System.out.print(currentNum + " ");
            }

        }


    }
}
