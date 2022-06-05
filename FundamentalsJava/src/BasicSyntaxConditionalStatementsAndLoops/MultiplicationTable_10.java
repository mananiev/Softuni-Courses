package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10 ; i++) {
            int sum = a*i;
            System.out.printf("%d X %d = %d", a, i, sum);
            System.out.println();
            
        }
    }
}
