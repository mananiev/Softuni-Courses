package Methods_Lab;

import java.util.Scanner;

public class _07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeat(input, n));
    }

    public static String repeat( String textToRepeat, int n){

        String output = "";
        for (int i = 1; i <= n ; i++) {

            output +=textToRepeat;

        }
        return output;

    }
}
