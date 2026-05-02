import java.util.ArrayList;

public class GradeManager {
    private ArrayList<Student> students;

    public GradeManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void printReport() {
        System.out.println("\n--- Class Report ---");

        for (Student s : students) {
            System.out.println("Name: " + s.getName());
            System.out.println("Average: " + s.getAverage());
            System.out.println("Letter Grade: " + s.getLetterGrade());
            System.out.println();
        }
    }
}