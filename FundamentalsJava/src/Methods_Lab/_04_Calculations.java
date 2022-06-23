package Methods_Lab;

import java.util.Scanner;

public class _04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "add":
                add(firstNum,secondNum);
                break;
            case "multiply":
                multiply(firstNum,secondNum);
                break;
            case "subtract":
                subtract(firstNum,secondNum);
                break;
            case "divide":
                divide(firstNum,secondNum);
                break;
        }
    }

    public static void add(int firstN, int secondN){
        int sum = firstN + secondN;
        System.out.println(sum);
    }

    public static void multiply(int firstN, int secondN){
        int sum = firstN * secondN;
        System.out.println(sum);
    }

    public static void subtract(int firstN, int secondN){
        int sum = firstN - secondN;
        System.out.println(sum);
    }

    public static void divide(int firstN, int secondN){
        int sum = firstN / secondN;
        System.out.println(sum);
    }
}
