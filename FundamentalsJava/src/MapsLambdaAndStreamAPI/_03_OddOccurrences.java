package MapsLambdaAndStreamAPI;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class _03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().toLowerCase().split( " ");

        LinkedHashMap<String , Integer> count = new LinkedHashMap<>();

        for (int i = 0; i < words.length; i++) {

            String currentWord = words[i];

            if (count.containsKey(currentWord)){
                count.put(currentWord, count.get(currentWord) + 1);
            } else {
                count.put(currentWord, 1);
            }

        }

        ArrayList<String>  odds = new ArrayList<>();

        for (var entry : count.entrySet()){
            if (entry.getValue()%2 == 1){
                odds.add(entry.getKey());
            }
        }

        System.out.println(odds.toString().replace("[","").replace("]",""));
    }
}
