package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays
                .stream(scanner.nextLine().split( " "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String[] input = scanner.nextLine().split( " ");


        while (!Objects.equals(input[0], "end")){

            if (input.length> 1 ){
                wagonsList.add(Integer.valueOf(input[1]));

            } else {
                int peopleToAdd = Integer.parseInt(input[0]);

                for (int i = 0; i < wagonsList.size(); i++) {

                    if (wagonsList.get(i) + peopleToAdd <= maxCapacity){
                        wagonsList.set( i , wagonsList.get(i) + peopleToAdd);
                        break;
                    }

                }
            }


            input = scanner.nextLine().split( " ");
        }

        System.out.println(wagonsList.toString().replaceAll( "[\\[\\],]", ""));
    }
}
