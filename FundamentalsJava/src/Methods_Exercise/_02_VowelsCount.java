package Methods_Exercise;

import java.util.Locale;
import java.util.Scanner;

public class _02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();



        printVowelsCount(text);
    }

    public static void printVowelsCount (String text){

        int count =0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == 'a'){
                count++;
            } else if (text.charAt(i) == 'e') {
                count++;
            } else if (text.charAt(i) == 'i') {
                count++;
            } else if (text.charAt(i) == 'o') {
                count++;
            } else if (text.charAt(i) == 'u') {
                count++;
            } else if (text.charAt(i) == 'y') {
                count++;
            }
        }
        System.out.println(count);

    }
}
