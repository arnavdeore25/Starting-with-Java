package Encapsulation;

class Student {
    String name = "Arnav";
    private int rollNo;
    private int totalMarks;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    double gradeCalculator() {
        double grade;
        grade = (totalMarks/500.0) * 100;
        return grade;
    }

}

public class StudentResult {
    public static void main(String[] args) {
        Student std1 = new Student();
        System.out.println("=============BANK ACCOUNT DETAILS=============");
        std1.setRollNo(1111113);
        std1.setTotalMarks(397);
        System.out.println("Grade: "+std1.gradeCalculator());
    }
}