package Arrays_Exercise;

import java.util.Scanner;

public class _10_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] treasureChest = scanner.nextLine().split("|");

        String[] input = scanner.nextLine().split(" ");

        while (true) {

            if (input[0].equals("Loot")) {

            } else if (input[0].equals("Drop")) {

                if (Integer.parseInt(input[1]) > treasureChest.length) {
                    continue;
                } else {
                    String temp = treasureChest[Integer.parseInt(input[1])];
                    for (int i = Integer.parseInt(input[1]); i < treasureChest.length; i++) {
                        treasureChest[i] = treasureChest[i + 1];

                    }
                    treasureChest[treasureChest.length - 1] = temp;
                }

            } else if (input[0].equals("Steal")) {

            } else if (input[0].equals("Yohoho!")) {
                double sum = 0;

                for (int i = 0; i < treasureChest.length; i++) {
                    sum += treasureChest[i].length();

                }
                double average = sum / treasureChest.length;
                System.out.printf("%.2f", average);

                break;
            }
            input = scanner.nextLine().split(" ");
        }
    }
}
