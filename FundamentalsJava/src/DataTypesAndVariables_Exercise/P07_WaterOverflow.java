package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int sumTank = 0;

        for (int i = 0; i < n ; i++) {
            int pour = Integer.parseInt(scanner.nextLine());

            if (pour > capacity) {
                System.out.println("Insufficient capacity!");
            } else if ( pour <= capacity  ){
                sumTank += pour;
                capacity -= pour;

            }



        }
        System.out.println(sumTank);
    }
}
