import java.util.Scanner;

public class messageFormatter 
{

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.print("Enter course: ");
        String course=sc.nextLine();
        System.out.print("Enter college: ");
        String college =sc.nextLine();
        System.out.print("Enter skills: ");
        String skills= sc.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa =sc.nextDouble();
        StringBuilder profile=new StringBuilder();
        profile.append("================================\n");
        profile.append("        STUDENT PROFILE\n");
        profile.append("================================\n");
        profile.append("Name    : ").append(name).append("\n");
        profile.append("Course  : ").append(course).append("\n");
        profile.append("College : ").append(college).append("\n");
        profile.append("Skills  : ").append(skills).append("\n");
        profile.append("CGPA    : ").append(cgpa).append("\n");
        profile.append("================================");
        System.out.println("\n" +profile);
        sc.close();
    }
}