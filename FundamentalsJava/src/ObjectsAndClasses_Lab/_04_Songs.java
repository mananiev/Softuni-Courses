package ObjectsAndClasses_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_Songs {

    static class Song {
        String typeList;
        String name;
        String time;

        Song (String type, String name, String time) {
            this.typeList = type;
            this.name = name;
            this.time = time;
        }

//        public void setTypeList(String typeList) {
//            this.typeList = typeList;
//        }

        public String getTypeList() {
            return this.typeList;
        }

//        public void setName(String name) {
//            this.name = name;
//        }

        public String getName() {
            return this.name;
        }

//        public void setTime(String time) {
//            this.time = time;
//        }

        public String getTime() {
            return this.time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song currentSong = new Song(type, name, time);

//            currentSong.setTypeList(type);
//            currentSong.setName(name);
//            currentSong.setTime(time);

            songsList.add(currentSong);
        }

        String command = scanner.nextLine();//all typeList

        if (command.equals("all")) {
            for (Song item : songsList) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : songsList) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
