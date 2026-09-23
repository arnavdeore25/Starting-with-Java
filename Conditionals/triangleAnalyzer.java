import java.util.*;

class traingleCheck {
    int flag = 0;

    public void validTriangle(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b)
            flag = 1;

        if (flag == 0) {
            System.out.println("Trangle Invalid");
            System.exit(1);
        }
    }

    public void checkEquilateral(int a, int b, int c)
    {
        if ( a==b && b==c)
            System.out.println("It is Equilateral Trianle");
    }

    public void checkIsosceles(int a, int b, int c) {
        if (a == b || b == c || a == c)
            System.out.println("It is Isosceles Trianle");
    }

    public void checkScalene(int a, int b, int c) {
        if (a + b > c || b + c > a || a + c > b)
            System.out.println("It is Isosceles Trianle");
    }

}

public class triangleAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        traingleCheck t1 = new traingleCheck();
        int s1, s2, s3, ch;
        System.out.println("Enter 1st side: ");
        s1 = sc.nextInt();
        System.out.println("Enter 2st side: ");
        s2 = sc.nextInt();
        System.out.println("Enter 3st side: ");
        s3 = sc.nextInt();
        t1.validTriangle(s1, s2, s3);
        System.out.println("What you want to check?\n1.Equilateral\n2.Isosceles\n3.Scalene ");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                t1.checkEquilateral(s1, s2, s3);
                break;
            case 2:
                t1.checkIsosceles(s1, s2, s3);
                break;
            case 3:
                t1.checkScalene(s1, s2, s3);
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
