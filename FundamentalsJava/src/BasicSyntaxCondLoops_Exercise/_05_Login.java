package BasicSyntaxCondLoops_Exercise;

import java.util.Scanner;

public class _05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password ="";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }


        int count = 1;

        while (count<=4){
            String passwordEnter = scanner.nextLine();

            if (passwordEnter.equals(password) ) {
                System.out.printf("User %s logged in.", username);
                break;
            } else if (count< 4){
                System.out.println("Incorrect password. Try again.");
            }
            count++;
        }

        if (count == 5) {
            System.out.printf("User %s blocked!", username);
        }


    }

}
