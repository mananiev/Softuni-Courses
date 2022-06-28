package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");


        while (!Objects.equals(input[0], "end")) {
            int element = Integer.parseInt(input[1]);

            switch (input[0]) {
                case "Delete":
                    while (numList.contains(element)) {
                        numList.remove(Integer.valueOf(input[1]));
                    }
                    break;
                case "Insert":
                    numList.add(Integer.parseInt(input[2]), Integer.parseInt(input[1]));
                    break;

            }

            input = scanner.nextLine().split(" ");
        }

        System.out.println(numList.toString().replaceAll( "[\\[\\],]", ""));
    }
}
