package student_grade;

import java.util.Scanner;

public class Student_grade {

    public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
        GradeTracker tracker = new GradeTracker();

        System.out.println("=== CodeAlpha Student Grade Tracker ===");

        while (true) {
            System.out.print("Enter Student Name (or 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) break;

            double grade = -1;
            while (true) {
                try {
                    System.out.print("Enter Grade for " + name + " (0-100): ");
                    grade = Double.parseDouble(scanner.nextLine());
                    
                    if (grade >= 0 && grade <= 100) {
                        break; 
                    }
                    else {
                        System.out.println("Invalid! Grade must be between 0 and 100.");
                    }
                } 
                catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid number (e.g., 89 or 90.5).");
                }
            }

            tracker.addStudent(name, grade);
        }

        if (tracker.getCount() > 0) {
            displayResults(tracker);
        } 
        else {
            System.out.println("No data entered.");
        }
        scanner.close();
    }

    private static void displayResults(GradeTracker tracker) {
        System.out.println("\n--- Summary Report ---");
        System.out.println("Total Students: " + tracker.getCount());
        System.out.println("Average Grade: " + tracker.calculateAverage());        System.out.println("Highest: " + tracker.getHighestStudent().getName() + " (" + tracker.getHighestStudent().getGrade() + ")");
        System.out.println("Lowest:  " + tracker.getLowestStudent().getName() + " (" + tracker.getLowestStudent().getGrade() + ")");
        System.out.println("----------------------");
    }

}
