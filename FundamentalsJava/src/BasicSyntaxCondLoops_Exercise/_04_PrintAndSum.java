package BasicSyntaxCondLoops_Exercise;

import java.util.Scanner;

public class _04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = startNum; i <= endNum ; i++) {
            sum += i;
            System.out.print(i);
            System.out.print(" ");

        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
