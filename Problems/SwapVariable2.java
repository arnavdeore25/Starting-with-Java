//swap without using 3rd varaible

public class SwapVariable2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a+b;
        b = a-b;
        a = a-b;

        //using bitwise operator
        a = 10;
        b = 20;
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println("A = "+a+"\nB = "+b);
    }
}
