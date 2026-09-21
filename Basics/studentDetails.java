import java.util.Scanner;

public class studentDetails 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        int regNo, age;
        String name;
        float cgpa;

        System.out.println("Enter Student Details: ");
        System.out.println("Enter Student Name: ");
        name = sc.nextLine();
        System.out.println("Enter Student registeration number: ");
        regNo = sc.nextInt();
        System.out.println("Enter Student age: ");
        age = sc.nextInt();
        System.out.println("Enter Student cgpa: ");
        cgpa = sc.nextFloat();

        System.out.println("=================Student Details=================\n\n");
        System.out.printf("%-18s %-20s %-12s %-12s%n", "Registration no", "Name", "Age", "CGPA");
        System.out.printf("%-18d %-20s %-12d %-12.2f%n", regNo, name, age, cgpa);
        sc.close();
    }
}