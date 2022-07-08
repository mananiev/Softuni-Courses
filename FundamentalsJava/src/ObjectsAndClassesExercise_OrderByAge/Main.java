package ObjectsAndClassesExercise_OrderByAge;



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        String personalInfo = scanner.nextLine();

        while (!Objects.equals(personalInfo, "End")){
            String name = personalInfo.split(" ")[0];
            String id = personalInfo.split(" ")[1];
            int age = Integer.parseInt(personalInfo.split(" ")[2]);

            Person person = new Person(name, id, age);
            personList.add(person);


            personalInfo = scanner.nextLine();
        }

        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person : personList){
            System.out.println(person);
        }
    }
}
