package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class _01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordArr = scanner.nextLine().split( " ");

        Random random = new Random();

        for (int i = 0; i < wordArr.length; i++) {

            int x = random.nextInt(wordArr.length);
            int y = random.nextInt(wordArr.length);

            String temp = wordArr[x];
            wordArr[x] = wordArr[y];
            wordArr[y] = temp;

        }

        System.out.println(String.join(System.lineSeparator(), wordArr));
    }
}
