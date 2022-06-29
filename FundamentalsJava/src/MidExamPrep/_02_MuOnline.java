package MidExamPrep;

import java.util.Scanner;

public class _02_MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rooms = scanner.nextLine().split("\\|");

        int health = 100;
        int bitcoin = 0;
        int roomCount= 0;
        boolean dead = false;


        for (int i = 0; i < rooms.length && !dead; i++) {
            String[] roomAction = rooms[i].split(" ");

            String roomType = roomAction[0];
            int valueOfRoom = Integer.parseInt(roomAction[1]);

            switch (roomType){

                case "chest":
                    bitcoin += valueOfRoom;
                    System.out.printf("You found %d bitcoins.%n", valueOfRoom);
                    roomCount++;
                    break;
                case "potion":

                    if (health+valueOfRoom >= 100){
                        System.out.printf("You healed for %d hp.%n", 100 - health);
                        health = 100;
                    } else {
                        health += valueOfRoom;
                        System.out.printf("You healed for %d hp.%n", valueOfRoom);
                    }
                    System.out.printf("Current health: %d hp.%n", health);
                    roomCount++;
                    break;
                default:
                    roomCount++;
                    health -= valueOfRoom;

                    if (health>0){
                        System.out.printf("You slayed %s.%n", roomType);

                    } else {
                        dead = true;
                        System.out.printf("You died! Killed by %s.%n", roomType);
                        System.out.printf("Best room: %d", roomCount);
                    }
                    break;

            }

        }

        if (!dead){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoin);
            System.out.printf("Health: %d", health);
        }
    }
}
