package Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double output= mathPower(number, power);

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(output));
    }

    public static double mathPower(double number, int power ){
        double result = 1;
        for (int i = 0; i < power ; i++) {
            result *= number;
        }

        return result;
    }
}
