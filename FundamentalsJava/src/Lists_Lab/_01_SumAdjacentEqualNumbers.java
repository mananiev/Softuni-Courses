package Lists_Lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class _01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numList.size() -1 ; i++) {

            if (Objects.equals(numList.get(i), numList.get(i + 1))){
                numList.set(i, numList.get(i) + numList.get(i+1));
                numList.remove(i+1);

                i=-1;
            }

        }

        System.out.println(joinElementsByDelimiter(numList, " "));


    }

    public static String joinElementsByDelimiter(List<Double> list, String delimiter){

        String output= "";
        for (double item: list) {
            DecimalFormat df=  new DecimalFormat( "0.#");

            String numDf = df.format(item) + delimiter;


            output+=numDf;
        }

        return output;
    }
}
