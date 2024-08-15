public class Main {
    public static void main(String[] args) {

        // Creates firstStudent object
        Student firstStudent = new Student("Nicholas Madson", 75);

        // Calculates student grade and assigns it to a variable
        char grade = firstStudent.calculateGrade();

        // Prints out Student name and grade
        System.out.println("Name: " + firstStudent.name);
        System.out.println("Grade: " + grade);
    }
}