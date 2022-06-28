package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String[] input = scanner.nextLine().split(" ");


        while (!Objects.equals(input[0], "End")) {

            switch (input[0]) {
                case "Add":
                    numList.add(Integer.valueOf(input[1]));
                    break;
                case "Remove":
                    int index = Integer.parseInt(input[1]);
                    if (index > numList.size() - 1) {
                        System.out.println("Invalid index");
                    } else {
                        numList.remove(index);
                    }
                    break;
                case "Insert":
                    int index2 = Integer.parseInt(input[2]);
                    if (index2 > numList.size() - 1) {
                        System.out.println("Invalid index");
                    } else {
                        numList.add(index2, Integer.parseInt(input[1]));
                    }
                    break;
                case "Shift":
                    if (Objects.equals(input[1], "left")) {
                        int iterations = Integer.parseInt(input[2]);

                        for (int i = 0; i < iterations; i++) {

                            int temp = numList.get(0);

                            for (int j = 0; j < numList.size() - 1; j++) {
                                numList.set(j, numList.get(j + 1));

                            }

                            numList.set(numList.size() - 1, temp);
                        }


                    } else if (Objects.equals(input[1], "right")) {
                        int iterations = Integer.parseInt(input[2]);

                        for (int i = 0; i < iterations; i++) {

                            int temp = numList.get(numList.size() - 1);

                            for (int j = numList.size() - 1; j > 0; j--) {
                                numList.set(j, numList.get(j - 1));

                            }

                            numList.set(0, temp);
                        }

                    }

                    break;

            }

            input = scanner.nextLine().split(" ");
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
