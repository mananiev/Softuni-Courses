package BasicSyntaxCondLoops_Exercise;

import java.util.Scanner;

public class _10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double priceOfLighsabre = Double.parseDouble(scanner.nextLine());
        double priceOfRobe = Double.parseDouble(scanner.nextLine());
        double priceOfBelt = Double.parseDouble(scanner.nextLine());

        int freeBelts = 0;

         freeBelts = studentCount / 6;

        double totalCost = priceOfLighsabre * Math.ceil(studentCount * 1.1) +
                priceOfRobe * studentCount + priceOfBelt * (studentCount - freeBelts);

        if (totalCost<= availableMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        } else {
            double needed = Math.abs(availableMoney - totalCost);
            System.out.printf("George Lucas will need %.2flv more.", needed);
        }

    }
}
