package Arrays;

import java.util.Scanner;

public class _04_ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length / 2; i++) {

            String temp = inputArr[i];

            inputArr[i] = inputArr[inputArr.length - i -1];

            inputArr[inputArr.length - i - 1] = temp;

            
        }

        for (int i = 0; i < inputArr.length; i++) {
            System.out.print(inputArr[i] + " ");
        }
    }
}
