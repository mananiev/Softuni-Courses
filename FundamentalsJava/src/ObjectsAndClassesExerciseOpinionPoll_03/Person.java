package ObjectsAndClassesExerciseOpinionPoll_03;

public class Person {

    private String name;

    public int getAge() {
        return this.age;
    }

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
}
