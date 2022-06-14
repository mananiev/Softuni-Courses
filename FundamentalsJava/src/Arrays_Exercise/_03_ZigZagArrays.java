package Arrays_Exercise;

import java.util.Scanner;

public class _03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[lines];
        int[] secondArr = new int[lines];

        for (int i = 0; i < lines; i++) {
            String[] temp = scanner.nextLine().split(" ");

            if (i % 2 == 0){
                firstArr[i] = Integer.parseInt(temp[0]);
                secondArr[i]= Integer.parseInt(temp[1]);
            } else {
                firstArr[i] = Integer.parseInt(temp[1]);
                secondArr[i] = Integer.parseInt(temp[0]);
            }

        }

        for (int num: firstArr
             ) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num: secondArr
        ) {
            System.out.print(num + " ");
        }
    }
}
