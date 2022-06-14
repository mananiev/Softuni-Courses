package Arrays_Exercise;

import java.util.Scanner;

public class _01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[countWagons];
        int sum= 0;

        for (int i = 0; i < countWagons ; i++) {

            wagons[i] = Integer.parseInt(scanner.nextLine());
            sum+= wagons[i];

        }


        for (int num: wagons
             ) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(sum);


    }
}
