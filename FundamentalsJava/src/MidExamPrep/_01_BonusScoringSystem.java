package MidExamPrep;
import java.util.Scanner;

public class _01_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        int maxAttendance = 0;

        for (int i = 0; i < studentCount ; i++) {
                int attendance = Integer.parseInt(scanner.nextLine());

                double totalBonus = attendance * 1.0 / lecturesCount * (5 + initialBonus);


                if (totalBonus > maxBonus) {
                    maxAttendance = attendance;
                    maxBonus = totalBonus;
                }


        }

        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendance );

    }
}
