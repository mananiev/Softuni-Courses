package Lists_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class _03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandCount = Integer.parseInt(scanner.nextLine());

        List<String> guestsList = new ArrayList<>();

        for (int i = 0; i < commandCount ; i++) {

            String[] command = scanner.nextLine().split( " ");

            if (Objects.equals(command[2], "going!")){
                if (guestsList.contains(command[0])){
                    System.out.printf("%s is already in the list!%n", command[0]);
                } else {
                    guestsList.add(command[0]);
                }

            } else if (Objects.equals(command[2], "not")) {

                if ( guestsList.contains(command[0])){
                    guestsList.remove(command[0]);
                } else {
                    System.out.printf("%s is not in the list!%n", command[0]);
                }


            }

        }


        for (int i = 0; i < guestsList.size(); i++) {
            System.out.println(guestsList.get(i));

        }
    }
}
