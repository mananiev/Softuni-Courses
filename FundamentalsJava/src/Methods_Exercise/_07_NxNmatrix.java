package Methods_Exercise;

import java.util.Scanner;

public class _07_NxNmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

       printMatrix(n);

    }

    public static void printMatrix(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println();

            for (int j = 0; j < n; j++) {
                System.out.print(n+ " ");

            }

        }
    }
}
