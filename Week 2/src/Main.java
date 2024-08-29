import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // Prompts user for student name
        System.out.print("Please enter new student name: ");
        String studName = myScanner.nextLine();

        // Creates a new student object with maximum information
        Student s1 = new Student(studName, "916-499-3857", "Male", 28, "05-25",
                4798001, 0, 0);

        // Prompts user for number of assignments they're entering
        System.out.print("How many assignments are you inputting? ");
        int numberOfAssignments = myScanner.nextInt();

        // Updates student's number of assignments
        s1.numOfAssignments = numberOfAssignments;

        System.out.println("\nNumber of assignments to input: " + numberOfAssignments);
        int i = 0;
        while (i < numberOfAssignments) {
            System.out.printf("Assignment %d Score: ", i+1);
            int score = myScanner.nextInt();
            s1.addAssignmentScore(score);
            i++;
        }

        s1.showDetails();
        s1.isBirthday();
    }
}