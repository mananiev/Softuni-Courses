package MapsLambdaAndStreamAPI_Exercise;

import java.util.*;

public class _01_CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replace(" ","");

        Map<Character,Integer> countMap = new LinkedHashMap<>();

        for (int i = 0; i <=input.length() -1 ; i++) {
            char currentChar = input.charAt(i);

            if (countMap.containsKey(currentChar)){

                countMap.put(currentChar, countMap.get(currentChar) +1);

            } else {
                countMap.put(currentChar, 1);
            }

        }

//        for (char current : countMap.keySet()){
//
//            System.out.printf("%c -> %d%n", current , countMap.get(current));
//        }

        countMap.entrySet().forEach( entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
