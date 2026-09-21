class calculateMarks
{
    public double mark(int m1, int m2, int m3, int m4, int m5)
    {
        int sum = m1+m2+m3+m4+m5;
        double per = (sum/500.0) * 100;
        return per;
    }
}

public class percentCalculator {
    public static void main (String a[])
    {
        calculateMarks c1 = new calculateMarks();
        System.out.println("Percentage = " + c1.mark(69, 78, 90, 95, 81));
    }
}
