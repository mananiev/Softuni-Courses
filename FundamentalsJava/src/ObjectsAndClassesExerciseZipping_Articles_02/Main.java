package ObjectsAndClassesExerciseZipping_Articles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleParts = scanner.nextLine().split( ", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        Article article = new Article(title,content, author);

        int commandCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= commandCount ; i++) {

            String[] command  = scanner.nextLine().split(": ");

            String commandName = command[0];
            String newCommand = command[1];

            switch (commandName){
                case "Edit":
                    article.setContent(newCommand);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(newCommand);
                    break;
                case "Rename":
                    article.setTitle(newCommand);
                    break;

            }


        }

        System.out.println(article);
    }
}
