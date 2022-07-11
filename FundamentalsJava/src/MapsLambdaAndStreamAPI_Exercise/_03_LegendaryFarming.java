package MapsLambdaAndStreamAPI_Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Map<String, Integer> valuableMap = new LinkedHashMap<>();
        valuableMap.put("shards", 0);
        valuableMap.put("fragments", 0);
        valuableMap.put("motes", 0);

        Map<String, Integer> junkMap = new LinkedHashMap<>();

        boolean breaker = true;

        while (breaker) {

            for (int i = 0; i < input.length; i = i + 2) {
                String item = input[i + 1].toLowerCase();
                int quantity = Integer.parseInt(input[i]);

                if (valuableMap.containsKey(item)) {
                    valuableMap.put(item, valuableMap.get(item) + quantity);
                } else if (junkMap.containsKey(item)) {
                    junkMap.put(item, junkMap.get(item) + quantity);
                } else {
                    junkMap.put(item, quantity);
                }

                if (valuableMap.get("shards") >= 250) {
                    valuableMap.put("shards", valuableMap.get("shards") - 250);
                    System.out.println("Shadowmourne obtained!");
                    breaker = false;
                    break;

                } else if (valuableMap.get("motes") >= 250) {
                    valuableMap.put("motes", valuableMap.get("motes") - 250);
                    System.out.println("Dragonwrath obtained!");
                    breaker = false;
                    break;

                } else if (valuableMap.get("fragments") >= 250) {
                    valuableMap.put("fragments", valuableMap.get("fragments") - 250);
                    System.out.println("Valanyr obtained!");
                    breaker = false;
                    break;

                }
            }
            if (breaker) {
                input = scanner.nextLine().split(" ");
            }
        }

        valuableMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }
}
