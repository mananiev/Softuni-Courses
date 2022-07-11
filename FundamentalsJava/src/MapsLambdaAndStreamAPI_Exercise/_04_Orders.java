package MapsLambdaAndStreamAPI_Exercise;

import java.util.*;

public class _04_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Double> productsQuantity = new LinkedHashMap<>();
        Map<String, Double> finalMap = new LinkedHashMap<>();

        while (!Objects.equals(input, "buy")) {
            String[] data = input.split(" ");

            String item = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);

            if (!productsPrice.containsKey(item)) {
                productsPrice.put(item, price);
                productsQuantity.put(item, quantity);

            } else if (productsPrice.containsKey(item) && productsPrice.get(item) != price) {
                productsPrice.put(item, price);
                productsQuantity.put(item, productsQuantity.get(item) + quantity);

            } else if (productsPrice.containsKey(item) && productsPrice.get(item) == price) {

                productsQuantity.put(item, productsQuantity.get(item) + quantity);

            }

            finalMap.put(item , productsPrice.get(item) * productsQuantity.get(item));
            input = scanner.nextLine();
        }


        finalMap.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(),entry.getValue()));

    }
}
