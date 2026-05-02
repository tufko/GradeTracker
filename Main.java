import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradeManager manager = new GradeManager();

        int choice = 0;

        while (choice != 3) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Report");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            try {
                choice = input.nextInt();
                input.nextLine();

                if (choice == 1) {
                    System.out.print("Enter student name: ");
                    String name = input.nextLine();

                    Student student = new Student(name);

                    System.out.print("How many grades? ");
                    int count = input.nextInt();

                    for (int i = 0; i < count; i++) {
                        System.out.print("Enter grade: ");
                        double grade = input.nextDouble();
                        student.addGrade(grade);
                    }

                    manager.addStudent(student);
                }

                if (choice == 2) {
                    manager.printReport();
                }

            } catch (Exception e) {
                System.out.println("Invalid input");
                input.nextLine();
            }
        }

        input.close();
    }
}