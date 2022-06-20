package Arrays_Exercise;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class _11_LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize];

        int[] bugPositions = Arrays
                .stream(scanner.nextLine().split( " "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int bugPosition:bugPositions) {

            if (bugPosition >= 0 && bugPosition<field.length){
            field[bugPosition]=1;}

        }

        String line = scanner.nextLine();

        while(!Objects.equals(line, "end")){

            String[] data = line.split(" ");

            int index = Integer.parseInt(data[0]);
            String direction = data[1];
            int flyLength = Integer.parseInt(data[2]);

            if (index < 0 || index >= fieldSize || field[index] != 1){
                line = scanner.nextLine();
                continue;
            }

            field[index] = 0;

            switch (direction){
                case "right":
                    index += flyLength;
                    while (index<fieldSize && field[index] == 1){
                        field[index] = 1;
                    }

                    if (index<fieldSize){
                        field[index] = 1;
                    }
                    break;
                case "left":
                    index -= flyLength;
                    while (index >= 0 && field[index]== 1){
                        index -= flyLength;
                    }

                    if (index>= 0){
                        field[index] = 1;
                    }

                    break;
            }



            line = scanner.nextLine();
        }
        Arrays.stream(field).forEach(e -> System.out.print(e + " "));
    }
}
