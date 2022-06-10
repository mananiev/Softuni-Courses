package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while(a>0){
            sum = sum + (a %10);

            a = a /10;

        }
        System.out.println(sum);
    }
}
