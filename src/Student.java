class Student {
    public String name;
    public int score;

    public Student(String studName, int studScore) {
        name = studName;
        score = studScore;
    }

    public char calculateGrade() {
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
}
