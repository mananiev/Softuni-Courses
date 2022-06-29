package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _09_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distancePokemon = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (distancePokemon.size() != 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= distancePokemon.size() - 1) {
                int removedElement = distancePokemon.get(index);
                distancePokemon.remove(index);
                for (int i = 0 ; i<distancePokemon.size() - 1 ; i++) {
                    int currentNumber = distancePokemon.get(i);
                    if (currentNumber <= removedElement){
                        currentNumber+=removedElement;
                        distancePokemon.set(i , currentNumber);
                    } else {
                        currentNumber -=removedElement;
                    }
                    distancePokemon.set(index, currentNumber);
                                    }


            } else if (index < 0) {
                int removedElementFirst = distancePokemon.get(0);
                int lastElement = distancePokemon.get(distancePokemon.size() -1);
                distancePokemon.set( 0 , lastElement);



            } else if (index > distancePokemon.size() - 1) {


            }
        }
        //not finished
    }
}
