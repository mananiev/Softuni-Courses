package Methods_Lab;

import java.util.Scanner;

public class _01_SignOfIntegerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        printSign(input);
        
    }

    public static void printSign(int num){
        if (num>0){
            System.out.printf("The number %d is positive.", num);
        } else if (num< 0){
            System.out.printf("The number %d is negative.", num);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}
