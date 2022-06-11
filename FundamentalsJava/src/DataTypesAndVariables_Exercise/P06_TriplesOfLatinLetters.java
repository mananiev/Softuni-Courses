package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLatinLetters = Integer.parseInt(scanner.nextLine());

        for (int i = 1 ; i <= numberOfLatinLetters; i++) {
            for (int j = 1; j <= numberOfLatinLetters ; j++) {
                for (int k = 1; k <= numberOfLatinLetters; k++) {
                    char current = 96;
                    System.out.printf("%c" ,current+i);
                    System.out.printf("%c" ,current+j);
                    System.out.printf("%c" ,current+k);
                    System.out.println();

                }

            }
                        
        }

    }
}
