package Methods_Lab;

import java.util.Scanner;

public class _06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = calculateRectangleArea(width, length);
        System.out.printf("%.0f", area);
    }

    public static double calculateRectangleArea(double width, double length) {

        double area = width * length;
        return area;


    }
}
