package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P10_Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nPokePower = Integer.parseInt(scanner.nextLine());
        int mDistanceBetweenTargets = Integer.parseInt(scanner.nextLine());
        int yExhaustionFactor = Integer.parseInt(scanner.nextLine());

        int count = 0;
        double fifty = nPokePower / 2.0;

        while(nPokePower>=mDistanceBetweenTargets ) {
            nPokePower -= mDistanceBetweenTargets;
            count++;

            if (nPokePower == fifty && yExhaustionFactor != 0 && nPokePower != 0) {

                nPokePower = nPokePower / yExhaustionFactor;
            }


        }

        System.out.println(nPokePower);
        System.out.println(count);
    }
}
