package MapsLambdaAndStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split( " "))
                .map(Integer::parseInt)
                .sorted((e1,e2) -> e2.compareTo(e1))
                .limit(3)
                .collect(Collectors.toList());


        for ( int element : numbersList){
            System.out.println(element + " ");
        }
    }
}
