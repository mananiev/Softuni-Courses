package MapsLambdaAndStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> parking = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");

            String command = input[0];
            String person = input[1];

            switch (command) {
                case "register":
                    if (!parking.containsKey(person)) {
                        parking.put(person, input[2]);
                        System.out.printf("%s registered %s successfully%n", person, input[2]);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", parking.get(person));
                    }
                    break;
                case "unregister":
                    if (parking.containsKey(person)) {
                        parking.remove(person);
                        System.out.printf("%s unregistered successfully%n", person);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", person);
                    }
                    break;

            }

        }

        parking.entrySet().forEach(entry -> System.out.printf("%s => %s%n", entry.getKey(),entry.getValue()));

    }
}
