package BasicSyntaxCondLoops_Exercise;

import java.util.Scanner;

public class _08_TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= a; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print(i + " ");

            }
            System.out.println();
        }
    }
}
