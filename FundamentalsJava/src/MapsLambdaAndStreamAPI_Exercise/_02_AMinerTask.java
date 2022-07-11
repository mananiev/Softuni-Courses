package MapsLambdaAndStreamAPI_Exercise;

import java.util.*;

public class _02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> inventoryMap = new LinkedHashMap<>();

        while (!Objects.equals(input, "stop")){
            int value = Integer.parseInt(scanner.nextLine());

            if (!inventoryMap.containsKey(input)){
                inventoryMap.put(input,value);
            } else {
                inventoryMap.put(input, inventoryMap.get(input) + value);
            }

            input = scanner.nextLine();
        }

        inventoryMap.entrySet().forEach( entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
