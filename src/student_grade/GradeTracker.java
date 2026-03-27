package student_grade;

import java.util.ArrayList;

public class GradeTracker {

    private ArrayList<Student> students;

    public GradeTracker() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String name, double grade) {
        students.add(new Student(name, grade));
    }

    public double calculateAverage() {
        if (students.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Student s : students) {
            sum += s.getGrade();
        }
        return sum / students.size();
    }

    public Student getHighestStudent() {
        if (students.isEmpty()) {
            return null;
        }
        Student highest = students.get(0);
        for (Student s : students) {
            if (s.getGrade() > highest.getGrade()) {
                highest = s;
            }
        }
        return highest;
    }

    public Student getLowestStudent() {
        if (students.isEmpty()) {
            return null;
        }
        Student lowest = students.get(0);
        for (Student s : students) {
            if (s.getGrade() < lowest.getGrade()) {
                lowest = s;
            }
        }
        return lowest;
    }

    public int getCount() {
        return students.size();
    }
}
