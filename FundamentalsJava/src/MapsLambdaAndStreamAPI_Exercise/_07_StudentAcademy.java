package MapsLambdaAndStreamAPI_Exercise;

import java.util.*;

public class _07_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 0; i < studentsCount ; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentGrades.containsKey(studentName)){
                studentGrades.put(studentName, new ArrayList<>());
            }

            studentGrades.get(studentName).add(grade);


        }

        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry: studentGrades.entrySet()){

            String studentName = entry.getKey();

            List<Double> grades = entry.getValue();

            double average = getAverageGrade(grades);

            if (average>= 4.5){
                studentAverageGrade.put(studentName, average);
            }
        }

        studentAverageGrade.entrySet().stream()
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }

    private static double getAverageGrade(List<Double> grades) {

        double sumGrades = 0;

        for(double grade : grades){
            sumGrades += grade;
        }

        return sumGrades/grades.size();
    }
}
