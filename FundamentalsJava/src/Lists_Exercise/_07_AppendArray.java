package Lists_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class _07_AppendArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> listSeparatedByPipe = Arrays.stream(input.split("\\|")).collect(Collectors.toList());

        Collections.reverse(listSeparatedByPipe);

        System.out.println(listSeparatedByPipe.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .trim()
                .replaceAll( "\\s+" , " "));


    }
}
