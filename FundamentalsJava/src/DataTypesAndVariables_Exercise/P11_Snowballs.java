
package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;
        double bestSnowballValue = Double.MIN_VALUE;


        for (int i = 0; i < n; i++) {

            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());

            double value = Math.pow(snow / time, quality);

            if (value >= bestSnowballValue) {
                bestSnowballSnow = snow;
                bestSnowballTime = time;
                bestSnowballQuality = quality;
                bestSnowballValue= value;
            }



        }

        System.out.printf("%d : %d = %.0f (%d)", bestSnowballSnow, bestSnowballTime , bestSnowballValue, bestSnowballQuality);
    }
}
