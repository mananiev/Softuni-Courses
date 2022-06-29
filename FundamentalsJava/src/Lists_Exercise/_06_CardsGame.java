package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer  = Arrays
                .stream(scanner.nextLine().split( " "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays
                .stream(scanner.nextLine().split( " "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (firstPlayer.size()!= 0 && secondPlayer.size()!= 0){
            int tempOne = firstPlayer.get(0);
            int tempTwo = secondPlayer.get(0);

            if (tempOne == tempTwo){
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else if ( tempOne > tempTwo) {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
                firstPlayer.add(tempOne);
                firstPlayer.add(tempTwo);

            } else if (tempOne < tempTwo) {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
                secondPlayer.add(tempTwo);
                secondPlayer.add(tempOne);

            }

        }

        if (firstPlayer.size()> secondPlayer.size()){
            int sum =0;
            for (int i = 0; i < firstPlayer.size(); i++) {
                sum+= firstPlayer.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            int sum =0;
            for (int i = 0; i < secondPlayer.size(); i++) {
                sum+= secondPlayer.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sum);

        }
    }
}
