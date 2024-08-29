import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // Prompts user for student name
        System.out.print("Please enter new student name: ");
        String studName = myScanner.nextLine();

        // Creates new student object
        Student newStudent = new Student(studName, 0, 0);

        // Prompts user for number of assignments they're entering
        System.out.print("How many assignments are you inputting? ");
        int numberOfAssignments = myScanner.nextInt();

        // Updates student's number of assignments
        newStudent.numOfAssignments = numberOfAssignments;

        System.out.println("\nNumber of assignments to input: " + numberOfAssignments);
        int i = 0;
        while (i < numberOfAssignments) {
            System.out.printf("Assignment %d Score: ", i+1);
            int score = myScanner.nextInt();
            newStudent.addAssignmentScore(score);
            i++;
        }

        // Output Grades to Screen
        System.out.println("\n---STUDENT INFORMATION---");
        System.out.println("Student Name: " + newStudent.name);
        System.out.printf("Average Grade: %.2f%%\n", newStudent.calcAverageGrade());
        System.out.println("Final Grade: " + newStudent.getFinalGrade());
    }
}