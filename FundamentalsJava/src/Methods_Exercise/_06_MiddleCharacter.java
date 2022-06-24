package Methods_Exercise;

import java.util.Scanner;

public class _06_MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();


        printMid(text);
    }

    public static void printMid(String text){

        if (text.length() % 2 == 0){
            System.out.print(text.charAt((text.length()/2) -1 ));
            System.out.print(text.charAt(text.length()/2));

        } else {
            System.out.println(text.charAt(text.length()/2));
        }
    }
}
