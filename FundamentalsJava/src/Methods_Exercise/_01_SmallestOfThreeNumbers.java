package Methods_Exercise;

import java.util.Scanner;

public class _01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        smallestOfThree(firstNum,secondNum,thirdNum);

    }

    public static void smallestOfThree (int num1, int num2, int num3){

        int smallest = 0;

        if (num1<=num2 && num1 <= num3){
            smallest = num1;


        } else if (num2<= num1 && num2<=num3) {
            smallest = num2;

        } else if ( num3<=num1 && num3<=num2) {
            smallest=num3;

        }

        System.out.println(smallest);
    }
}
