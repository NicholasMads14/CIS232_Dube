public class Student extends Person {
    // Attributes
    int studentID;
    int numOfAssignments;
    int totalScore;
    double avgGrade;

    // Constructor - Max Information
    Student(String name, String phone, String gender, int age, String dateOfBirth,
            int studentID, int numOfAssignments, int totalScore) {
        super(name, phone, gender, age, dateOfBirth);
        this.studentID = studentID;
        this.numOfAssignments = numOfAssignments;
        this.totalScore = totalScore;
    }

    // Constructor - For student grade calculations
    Student(String name, int numOfAssignments, int totalScore) {
        super(name);
        this.name = name;
        this.numOfAssignments = numOfAssignments;
        this.totalScore = totalScore;
    }

    // Constructor - Minimum Information for student
    Student(String name, int studentID) {
        super(name);
        this.studentID = studentID;
    }

    /***********************
     METHODS
     ***********************/

    // Shows all details of Student
    @Override
    public void showDetails() {
        System.out.println("---Student Details---");
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Date of Birth: " + this.dateOfBirth);
        System.out.println("Age: " + this.age);
        System.out.println("Phone Number: " + this.phone);
        System.out.println("Student ID: " + this.studentID);
        System.out.printf("Average Grade: %.2f%%\n", this.calcAverageGrade());
        System.out.println("Letter Grade: " + this.getFinalGrade());

    }

    // Adds student scores to totalScore
    public void addAssignmentScore(int score) {
        totalScore += score;
    }

    // Calculates average grade, returns avgGrade
    public double calcAverageGrade() {
        avgGrade = (double) totalScore / numOfAssignments;
        return avgGrade;
    }

    // Method for calculating grade, returns grade as char
    public char getFinalGrade() {
        char grade = ' ';
        if (avgGrade > 100 || avgGrade < 0) {
            System.out.println("Grade is not between 0 and 100");
        }
        else if (avgGrade >= 90) {
            grade = 'A';
        } else if (avgGrade >= 80) {
            grade = 'B';
        } else if (avgGrade >= 70) {
            grade = 'C';
        } else if (avgGrade >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

}
