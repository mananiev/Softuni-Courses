package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int input = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <= numArr.length -1 ; i++) {

            for (int j = i+1; j <= numArr.length -1 ; j++) {

                int sum = numArr[i] + numArr[j];

                if (sum == input){
                    System.out.println(numArr[i] + " " + numArr[j]);
                }

            }

        }
    }
}
