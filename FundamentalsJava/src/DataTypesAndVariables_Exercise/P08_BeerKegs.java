package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String biggestOneYet ="";
        double bestVol = 0;

        for (int i = 1; i <= n ; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double vol = Math.PI * radius*radius * height;

            if (vol > bestVol){
                bestVol = vol;
                biggestOneYet = model;
            }

        }

        System.out.println(biggestOneYet);
    }
}
