package MapsLambdaAndStreamAPI_Exercise;

import java.util.*;

public class _09_Forcebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> sideMap = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {
            String[] input2 = input.split(" ");
            String command = input2[1];

            String side;
            String name;

            if (Objects.equals(command, "|")) {
                side = input2[0];
                name = input2[2];
            } else {
                name = input2[0];
                side = input2[2];
            }

            switch (command) {
                case "|":
                    if (!ContainsForceUser(sideMap, name) && !sideMap.containsKey(side)) {
                        sideMap.put(side, new ArrayList<>());
                        sideMap.get(side).add(name);
                    } else if (!ContainsForceUser(sideMap, name) && sideMap.containsKey(side)) {
                        sideMap.get(side).add(name);
                    }
                    break;
                case "->":
                    if (!ContainsForceUser(sideMap, name) && sideMap.containsKey(side)) {
                        sideMap.get(side).add(name);
                        System.out.printf("%s joins the %s side!%n", name, side);

                    } else if (!ContainsForceUser(sideMap, name) && !sideMap.containsKey(side)) {
                        sideMap.put(side, new ArrayList<>());
                        sideMap.get(side).add(name);
                        System.out.printf("%s joins the %s side!%n", name, side);
                    } else if (ContainsForceUser(sideMap, name)) {

                        String sideToRemoveFrom = WhoToRemove(sideMap, name);
                        sideMap.get(sideToRemoveFrom).remove(name);

                        //if sth fails check here for an IF
                        sideMap.get(side).add(name);
                        System.out.printf("%s joins the %s side!%n", name, side);

                    }
                    break;
            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : sideMap.entrySet()){

            if (entry.getKey(). == 0){
                continue;
            }

            System.out.printf("Side: %s, Members: %d", entry, entry.getKey().length());
            for (int i = 0; i < entry.getKey().length() ; i++) {

                System.out.println("! " + entry.getKey(). );
            }*/
        }

    }

    private static String WhoToRemove(Map<String, List<String>> map, String name) {

        String toReturn = null;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey().contains(name)) {
                toReturn = entry.getKey();
                break;
            }

        }

        return toReturn;
    }

    private static boolean ContainsForceUser(Map<String, List<String>> map, String name) {
        boolean contains = false;

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey().contains(name)) {
                contains = true;
                break;
            }

        }

        return contains;
    }
}
