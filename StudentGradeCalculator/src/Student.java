class Student {

    // Initialize variables
    String name;
    int numOfAssignments;
    int totalScore;
    double avgGrade;

    // Default Student constructor
    Student(String studName, int studAssignments, int studTotScore) {
        name = studName;
        numOfAssignments = studAssignments;
        totalScore = studTotScore;
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