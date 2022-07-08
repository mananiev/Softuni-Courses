package ObjectsAndClassesExerciseStudents_05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count= Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 1; i <= count ; i++) {


            String studentInfo = scanner.nextLine();
            String firstName = studentInfo.split(" ")[0];
            String lastName = studentInfo.split(" ")[1];
            double grade = Double.parseDouble(studentInfo.split(" ")[2]);


            Student student = new Student(firstName, lastName, grade);

            studentList.add(student);

        }

        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentList){
            System.out.printf("%s %s: %.2f%n", student.getFirstName(),student.getLastName(),student.getGrade());
        }

    }
}
