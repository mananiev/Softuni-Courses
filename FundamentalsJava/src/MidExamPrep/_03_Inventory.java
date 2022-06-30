package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" - ");

        while (!Objects.equals(input[0], "Craft!")){
            String action = input[0];
            String command = input[1];

            switch (action){
                case "Collect":
                    if (!inventory.contains(command)){
                        inventory.add(command);
                    }
                    break;
                case "Drop":
                    if (inventory.contains(command)){
                        inventory.remove(command);
                    }
                    break;
                case "Combine Items":
                    String[] items = command.split(":");
                    String oldItem = items[0];
                    String newItem = items[1];

                    if (inventory.contains(oldItem)){
                        inventory.add(inventory.indexOf(oldItem)+ 1 , newItem);
                    }
                    break;
                case "Renew":
                    if (inventory.contains(command)){
                        inventory.remove(command);
                        inventory.add(command);
                    }
                    break;
            }


            input = scanner.nextLine().split(" - ");
        }

        System.out.println(inventory.toString().replace("[", "")
                .replace("]", ""));
    }
}
