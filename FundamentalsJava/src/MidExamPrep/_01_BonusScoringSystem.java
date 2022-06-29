package MidExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());


        List<Integer> lecturesAttended = new ArrayList<>();

        double maxBonus = Double.MIN_VALUE;
        int studentNumber = Integer.MIN_VALUE;

        for (int i = 0; i < studentCount ; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            lecturesAttended.add(i , input);

            double totalBonus = (input *1.0)/ lecturesCount * (5 + initialBonus);


            if (totalBonus > maxBonus){
                studentNumber = i;
                maxBonus = totalBonus;
            }


        }

        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures." , lecturesAttended.get(studentNumber));

    } //90/100 .. one check blows, not sure which one, Zero tests work
}
