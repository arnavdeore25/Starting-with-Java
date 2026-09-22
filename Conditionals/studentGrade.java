import java.util.*;
class gradeAnalyzer
{
    public String grade(int marks)
    {
        if (marks > 90) 
            return "A+";
        else if (marks >80 && marks < 89)
            return "A";
        else if (marks > 65 && marks <79)
            return "B";
        else if (marks > 50 && marks <64)
            return "C";
        else if (marks > 35 && marks <49)
            return "D";
        else
            return "Fail";
    }
}

public class studentGrade
{
    public static void main(String args[])
    {
        int studentMarks;
        String grade;
        gradeAnalyzer g1 = new gradeAnalyzer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Student: ");
        studentMarks = sc.nextInt();
        grade = g1.grade(studentMarks);
        System.out.println("Student's Grade = "+ grade);
        sc.close();

    }
}