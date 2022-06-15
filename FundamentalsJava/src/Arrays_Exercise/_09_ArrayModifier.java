package Arrays_Exercise;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class _09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] commands = scanner.nextLine().split(" ");

        while (true) {


            if (commands[0].equals("swap")) {
                int index1 = Integer.parseInt(commands[1]);
                int index2 = Integer.parseInt(commands[2]);

                int temp = numArr[index1];

                numArr[index1] = numArr[index2];
                numArr[index2] = temp;


            } else if (commands[0].equals("multiply")) {
                int index1 = Integer.parseInt(commands[1]);
                int index2 = Integer.parseInt(commands[2]);

                numArr[index1] *= numArr[index2];

            } else if (commands[0].equals("decrease")) {
                for (int i = 0; i < numArr.length; i++) {
                    numArr[i]--;

                }


            } else if (commands[0].equals("end")) {

                for (int i = 0; i <= numArr.length-1 ; i++) {

                    if (i != numArr.length -1){
                        System.out.print(numArr[i] + ", ");
                    } else {
                        System.out.print(numArr[i]);
                    }

                }
                break;
            }

            commands = scanner.nextLine().split(" ");



        }
    }
}
