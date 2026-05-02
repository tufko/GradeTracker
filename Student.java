import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double getAverage() {
        double sum = 0;

        for (double g : grades) {
            sum += g;
        }

        if (grades.size() == 0) {
            return 0;
        }

        return sum / grades.size();
    }

    public String getLetterGrade() {
        double avg = getAverage();

        if (avg >= 90) return "A";
        if (avg >= 80) return "B";
        if (avg >= 70) return "C";
        if (avg >= 60) return "D";
        return "F";
    }

    public String getName() {
        return name;
    }
}