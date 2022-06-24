package Methods_Exercise;

import java.util.Scanner;

public class _04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean lengthCheck = checkingLength(password);
        boolean lettersAndDigitsCheck = checkingLettersAndDigits(password);
        boolean enoughNumbersCheck = hasAtLeastTwoDigits(password);

        if (lengthCheck && lettersAndDigitsCheck && enoughNumbersCheck) {
            System.out.println("Password is valid");
        } else {
            if (!lengthCheck) {
                System.out.println("Password must be between 6 and 10 characters");
            }

            if (!lettersAndDigitsCheck) {
                System.out.println("Password must consist only of letters and digits");
            }

            if (!enoughNumbersCheck) {
                System.out.println("Password must have at least 2 digits");
            }
        }


    }

    public static boolean checkingLength(String password) {

        return password.length() <= 10 && password.length() >= 6;
    }

    public static boolean checkingLettersAndDigits(String password) {
        boolean passwordOnlyLettersAndNumbers = false;
        char currentChar;


        for (int i = 0; i < password.length(); i++) {
            currentChar = password.charAt(i);

            if (Character.isLetterOrDigit(currentChar)) {
                passwordOnlyLettersAndNumbers = true;
            } else {
                passwordOnlyLettersAndNumbers = false;
                break;
            }

        }

        return passwordOnlyLettersAndNumbers;
    }

    public static boolean hasAtLeastTwoDigits(String password) {
        boolean passwordHasTwoNumbers = false;
        char currentChar;
        int counter = 0;

        for (int i = 0; i < password.length(); i++) {
            currentChar = password.charAt(i);

            if (Character.isDigit(currentChar)) {
                counter++;
            }

        }

        if (counter >= 2) {
            passwordHasTwoNumbers = true;
        }

        return passwordHasTwoNumbers;

    }
}
